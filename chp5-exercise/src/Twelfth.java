//: Twelfth.java
// This is the twelfth exercise of the chapter5.

class Tank {
	String tankStatus = "empty";
	Tank(String checkOut) {
		tankStatus = checkOut;
	}
	void checkIn() {
		tankStatus = "empty";
	}
	protected void finalize() {
		if (tankStatus == "full")
			System.out.println("Error: tank status is full");
		// Normally, you`ll also do this:
		// super.finalize(); // Call the base-class version
	}
}
public class Twelfth {
	public static void main(String[] args) {
		Tank tank = new Tank("full");
		// Proper cleanup;
		tank.checkIn();
		// Drop the reference, forget to clean up:
		new Tank("full");
		// Force garbage collection & finalization:
		System.gc();
	}
}
