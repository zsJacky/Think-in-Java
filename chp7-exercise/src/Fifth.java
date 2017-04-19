//: Fifth.java
// This is the fifth exercise of the chapter7.

class A {
	A() { System.out.println("A()"); }
}

class B {
	B() { System.out.println("B()"); }
}

class C extends A {
	private B b = new B();
//	C() { System.out.println("C()"); }
}
public class Fifth {
	public static void main(String[] args) {
		new C();
	}
}
