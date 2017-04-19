//: Seventh.java
// This is the seventh exercise of the chapter7.

class A1 {
	A1(int i) { System.out.println("A1() " + i); }
}

class B1 {
	B1(String s) { System.out.println("B1() " + s); }
}

class C1 extends A1 {
	private B1 b = new B1("hello");
	C1(int i) {
		super(i);
		System.out.println("C()"); }
}
public class Seventh {
	public static void main(String[] args) {
		new C1(11);
	}
}
