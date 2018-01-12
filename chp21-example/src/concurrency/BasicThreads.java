// the most basic use of the Thread class

package concurrency;

public class BasicThreads {
	public static void main(String[] args) {
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("Wainting for LiftOff");
	}
}
