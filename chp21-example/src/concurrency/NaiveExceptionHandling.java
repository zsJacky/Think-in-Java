package concurrency;

import java.util.concurrent.*;

public class NaiveExceptionHandling {
	public static void main(String[] args) {
		try {
			ExecutorService exec =
				Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread());
		} catch (RuntimeException ue) {
			// this statement will not execute
			System.out.println("Execution has been handled");
		}
	}
}
