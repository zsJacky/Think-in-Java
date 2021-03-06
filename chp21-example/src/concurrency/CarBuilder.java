// a complex example of tasks working together

package concurrency;

import java.util.*;
import java.util.concurrent.*;

import com.sun.swing.internal.plaf.synth.resources.synth;

import static net.mindview.util.Print.*;

class Car {
	private final int id;
	private boolean 
		engine = false, driveTrain = false, wheels = false;
	public Car(int idn) { id = idn; }
	// empty car object
	public Car() { id = -1; }
	public synchronized int getId() { return id; }
	public synchronized void addEngine() { engine = true; }
	public synchronized void addDriveTrain() {
		driveTrain = true;
	}
	public synchronized void addWheels() { wheels = true; }
	public String toString() {
		return "Cat " + id + " [" + " engine: " + engine
			+ " driveTrain: " + driveTrain
			+ " wheels: " + wheels + " ]";
	}
}

class CarQueue extends LinkedBlockingQueue<Car> {}

class ChassisBuilder implements Runnable {
	private CarQueue carQueue;
	private int counter = 0;
	public ChassisBuilder(CarQueue cq) { carQueue = cq; }
	public void run() {
		try {
			while(!Thread.interrupted()) {
				TimeUnit.MILLISECONDS.sleep(500);
				// make chassis
				Car c = new Car(counter++);
				print("ChassisBuilder created " + c);
				// insert into queue
				carQueue.put(c);
			}
		} catch(InterruptedException e) {
			print("Interrupted: ChassisBuilder");
		}
	}
}

class Assembler implements Runnable {
	private CarQueue chassisQueue, finishingQueue;
	private Car car;
	private CyclicBarrier barrier = new CyclicBarrier(4);
	private RobotPool robotPool;
	public Assembler(CarQueue cq, CarQueue fq, RobotPool rp) {
		chassisQueue = cq;
		finishingQueue = fq;
		robotPool = rp;
	}
	public Car car() { return car; }
	public CyclicBarrier barrier() { return barrier; }
	public void run() {
		try {
			while(!Thread.interrupted()) {
				// blocks until chassis is available
				car = chassisQueue.take();
				// hire robots to perform work
				robotPool.hire(EngineRobot.class, this);
				robotPool.hire(DriveTrainRobot.class, this);
				robotPool.hire(WheelRobot.class, this);
				barrier.await();	// until the robots finish
				// put cat into finishingQueue for further work
				finishingQueue.put(car);
			}
		} catch(InterruptedException e) {
			print("Exiting Assembler via interrupt");
		} catch(BrokenBarrierException e) {
			// this one we want to know about
			throw new RuntimeException(e);
		}
		print("Assembler off");
	}
}

class Reporter implements Runnable {
	private CarQueue carQueue;
	public Reporter(CarQueue cq) { carQueue = cq; }
	public void run() {
		try {
			while(!Thread.interrupted()) {
				print(carQueue.take());
			}
		} catch(InterruptedException e) {
			print("Exiting Reporter via interrupt");
		}
		print("Reporter off");
	}
}

abstract class Robot implements Runnable {
	private RobotPool pool;
	public Robot(RobotPool p) { pool = p; }
	protected Assembler assembler;
	public Robot assignAssembler(Assembler assembler) {
		this.assembler = assembler;
		return this;
	}
	private boolean engage = false;
	public synchronized void engage() {
		engage = true;
		notifyAll();
	}
	// the part of run() that's different for each robot
	abstract protected void performService();
	public void run() {
		try {
			powerDown();	// wait until needed
			while(!Thread.interrupted()) {
				performService();
				assembler.barrier().await();	// Synchronize
				// we're done with that job
				powerDown();
			}
		} catch(InterruptedException e) {
			print("Exiting " + this + " via interrupt");
		} catch(BrokenBarrierException e) {
			// this one we want to know about
			throw new RuntimeException(e);
		}
		print(this + " off");
	}
	private synchronized void powerDown() throws InterruptedException {
		engage = false;
		assembler = null;	// disconnect from the Assembler
		// put ourselves back in the available pool
		pool.release(this);
		while(engage == false)	// power down
			wait();
	}
	public String toString() { return getClass().getName(); }
}

class EngineRobot extends Robot {
	public EngineRobot(RobotPool pool) { super(pool); }
	protected void performService() {
		print(this + " installing engine");
	}
}

class DriveTrainRobot extends Robot {
	public DriveTrainRobot(RobotPool pool) {
		super(pool);
	}
	protected void performService() {
		print(this + " installing DriveTrain");
		assembler.car().addDriveTrain();
	}
}
class WheelRobot extends Robot {
	public WheelRobot(RobotPool pool) {
		super(pool);
	}
	protected void performService() {
		print(this + " installing Wheels");
		assembler.car().addWheels();
	}
}

class RobotPool {
	// Quietly prevents identical entries:
	private Set<Robot> pool = new HashSet<Robot>();
	public synchronized void add(Robot r) {
		pool.add(r);
		notifyAll();
	}
	public synchronized void hire(Class<? extends Robot> robotType, Assembler d)
			throws InterruptedException {
		for (Robot r : pool)
			if (r.getClass().equals(robotType)) {
				pool.remove(r);
				r.assignAssembler(d);
				r.engage(); // Power it up to do the task
				return;
			}
		wait(); // None available
		hire(robotType, d); // Try again, recursively
	}
	public synchronized void release(Robot r) {
		add(r);
	}
}
public class CarBuilder {
	public static void main(String[] args) throws Exception {
		CarQueue chassisQueue = new CarQueue(), finishingQueue = new CarQueue();
		ExecutorService exec = Executors.newCachedThreadPool();
		RobotPool robotPool = new RobotPool();
		exec.execute(new EngineRobot(robotPool));
		exec.execute(new DriveTrainRobot(robotPool));
		exec.execute(new WheelRobot(robotPool));
		exec.execute(new Assembler(chassisQueue, finishingQueue, robotPool));
		exec.execute(new Reporter(finishingQueue));
		// Start everything running by producing chassis:
		exec.execute(new ChassisBuilder(chassisQueue));
		TimeUnit.SECONDS.sleep(7);
		exec.shutdownNow();
	}
}

