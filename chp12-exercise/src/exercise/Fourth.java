package exercise;

class MyException extends Exception {
	String exceptionStr;
	public MyException(String s) {
		this.exceptionStr = s;
	}
	
	void f() {
		System.out.println(exceptionStr);
	}
}

public class Fourth {
	public static void main(String[] args) {
		try { 
			throw new MyException("Throwing MyException from f()");
		} catch (MyException e) {
			e.f();
		}
	}
}
