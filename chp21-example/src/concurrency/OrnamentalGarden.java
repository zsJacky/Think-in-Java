package concurrency;

import java.util.concurrent.*;
import java.util.*;
import static net.mindview.util.Print.*;

class Count {
	private int count = 0;
	private Random rand = new Random(47);
	// remove the synchronized keyword to see counting fail
	public synchronized int increment() {
		int temp = count;
		if(rand.nextBoolean()) // yield half the time
			Thread.yield();
		return (count = ++temp);
	}
	public synchronized int value() { return count; }
}

class Entrance implements Runnable {
	private static Count count = new Count();
	private static List<Entrance> entrances =
		new ArrayList<Entrance>();
	private int number = 0;
	// doesn't need synchronization to read
	private final int id;
	private static volatile boolean canceled = false;
	// atomic operation on a volatile field
	public static void cancel() { canceled = true; }
	public Entrance(int id) {
		this.id = id;
		// keep this task in a list. also prevents
		// garbage collection of dead tasks
		entrances.add(this);
	}
	public void run() {
		while(!canceled) {
			synchronized (this) {
				++number;
			}
			print(this + " Total: " + count.increment());
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch(InterruptedException e) {
				print("sleep interrupted");
			}
		}
		print("Stopping " + this);
	}
	public synchronized int getValue() { return number; }
	public String toString() {
		return "Entrance " + id + ": " + getValue();
	}
	public static int getTotalCount() {
		return count.value();
	}
	public static int sumEntrance() {
		int sum = 0;
		for(Entrance entrance : entrances)
			sum += entrance.getValue();
		return sum;
	}
}

public class OrnamentalGarden {
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++)
			exec.execute(new Entrance(i));
		// run for a while, then stop and collect the data
		TimeUnit.SECONDS.sleep(3);
		Entrance.cancel();
		exec.shutdown();
		if(exec.awaitTermination(250, TimeUnit.MICROSECONDS))
			print("Some tasks were not terminated");
		print("Total: " + Entrance.getTotalCount());
		print("Sum of Entrances: " + Entrance.sumEntrance());
	}
}
