package concurrency;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class AtomicIntegerTest implements Runnable {
	private AtomicInteger i = new AtomicInteger(0);
	public int getValue() {
		return i.get();
	}
	private synchronized void evenIncrement() {
		i.addAndGet(2);
	}
	public void run() {
		while (true)
			evenIncrement();
	}
	public static void main(String[] args) {
		new Timer().schedule(new TimerTask() {
			public void run() {
				System.out.println("Aborting");
				System.exit(0);
			}
		}, 5000); // terminate after 5 seconds
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicIntegerTest ait = new AtomicIntegerTest();
		exec.execute(ait);
		while (true) {
			int val = ait.getValue();
			if (val % 2 != 0) {
				System.out.println(val);
				System.exit(0);
			}
		}
	}
}
