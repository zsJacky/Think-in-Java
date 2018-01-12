package concurrency;

import java.util.concurrent.*;

public class FixedThreadPool {
	public static void main(String[] args) {
		// constructor argument is number of threads
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for(int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}
}