// programmatic access to stack trace information

package exceptions;

public class WhoCalled {
	static void f() {
		// generate an exception to fill in the stack trace
		try {
			throw new Exception();
		} catch (Exception e) {
			for (StackTraceElement ste : e.getStackTrace()) {
				System.out.println(ste.getMethodName());
			}
		}
	}
	static void g() {
		f();
	}
	static void h() {
		f();
	}
	public static void main(String[] args) {
		f();
		System.out.println("---------------");
		g();
		System.out.println("---------------");
		h();
	}
}
