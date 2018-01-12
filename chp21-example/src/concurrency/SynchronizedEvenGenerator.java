// simplifying mutexes with the synchronized keyword

package concurrency;

public class SynchronizedEvenGenerator extends IntGenerator {
	private int currentEvenValue = 0;
	public synchronized int next() {
		++currentEvenValue;
		// Thread.yield(); // causes failure faster
		++currentEvenValue;
		return currentEvenValue;
	}
	public static void main(String[] args) {
		EvenChecker.test(new SynchronizedEvenGenerator());
	}
}
