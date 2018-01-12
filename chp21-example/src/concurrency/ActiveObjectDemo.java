// can only pass constants, immutables "disconnected objects",
// or other active objects as arguments to async methods

package concurrency;

import java.util.*;
import java.util.concurrent.*;
import static net.mindview.util.Print.*;

public class ActiveObjectDemo {
	private ExecutorService ex = 
		Executors.newSingleThreadExecutor();
	private Random rand = new Random(47);
	// insert a random delay to produce the effect of calculation time
	private void pause(int factor) {
		try {
			TimeUnit.MILLISECONDS.sleep(
				100 + rand.nextInt(factor));
		} catch(InterruptedException e) {
			print("sleep() interrupted");
		}
	}
	public Future<Integer> calculateInt(final int x, final int y) {
		return ex.submit(new Callable<Integer>() {
			public Integer call() {
				print("starting " + x + " + " + y);
				pause(500);
				return x + y;
			}
		});
	}
	public Future<Float> calculateFloat(final float x, final float y) {
		return ex.submit(new Callable<Float>() {
			public Float call() {
				print("starting " + x + " + " + y);
				pause(2000);
				return x + y;
			}
		});
	}
	public void shutdown() { ex.shutdown(); }
	public static void main(String[] args) {
		ActiveObjectDemo dl = new ActiveObjectDemo();
		// prevents ConcurrentModificationException
		List<Future<?>> results = 
			new CopyOnWriteArrayList<Future<?>>();
		for(float f = 0.0f; f < 1.0f; f += 0.2f)
			results.add(dl.calculateFloat(f, f));
		for(int i = 0; i < 5; i++)
			results.add(dl.calculateInt(i, i));
		print("all asynch calls made");
		while(results.size() > 0) {
			for(Future<?> f : results)
				if(f.isDone()) {
					try {
						print(f.get());
					} catch(Exception e) {
						throw new RuntimeException(e);
					}
					results.remove(f);
				}
		}
		dl.shutdown();
	}
}
