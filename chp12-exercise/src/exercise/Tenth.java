package exercise;

class TenthException extends Exception { }

public class Tenth {
	public static void g() throws TenthException {
		System.out.println("originated in g()");
		throw new TenthException();
	}
	public static void f() {
		try {
			g();
		} catch (TenthException e) {
			System.out.println("Caught TenthException");
			e.initCause(new RuntimeException());
			e.printStackTrace(System.out);
			throw new NullPointerException();
		}
	}
	public static void main(String[] args) {
		try {
			f();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}
