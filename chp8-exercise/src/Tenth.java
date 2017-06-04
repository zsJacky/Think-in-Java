//: Tenth.java
// This is the tenth exercise of the chapter8.

class FatherClass {
	public void methodA() {
		methodB();
	}
	
	public void methodB() {
		System.out.println("FatherClass methodB");
	}
}

class ChildClass extends FatherClass {
	public void methodB() {
		System.out.println("ChildClass methodB");
	}
}

public class Tenth {
	public static void main(String[] args) {
		FatherClass f = new ChildClass();
		f.methodA();
	}
}




