package concurrency;

public class SerialNumberGenerator {
	private static volatile int serialNumber = 0;
	public static int nexterialNumber() {
		return serialNumber++; // not thread-safe
	}
}
