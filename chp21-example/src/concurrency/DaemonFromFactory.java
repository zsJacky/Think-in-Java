// Using a Thread Factory to create daemons

package concurrency;

import java.util.concurrent.*;

public class DaemonFromFactory implements Runnable {
	public void run() {
		try {
			while(true) {
				TimeUnit.MICROSECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " " + this);
			}
		} catch(InterruptedException e) {
			System.out.println("sleep() interrupted");
		}
	}
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
		for(int i = 0; i < 10; i++)
			exec.execute(new DaemonFromFactory());
		System.out.println("All daemons started");
		TimeUnit.MICROSECONDS.sleep(500);	// Run for a while
	}
}
