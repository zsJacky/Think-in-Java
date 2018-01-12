// when threads collide

package concurrency;

public class EvenGenerator extends IntGenerator {
	private int currentEvenValue = 0;
	public int next() {
		++currentEvenValue; // danger point here
		++currentEvenValue;
		return currentEvenValue;
	}
	public static void main(String[] args) {
		EvenChecker.test(new EvenGenerator());
	}
}
