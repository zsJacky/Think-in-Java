//: OverloadingOrder.java
// Overloading based on the order of the argument

public class OverloadingOrder {
	static void f(int i, String s) {
		System.out.println("int: " + i + ", String: " + s);
	}
	static void f(String s, int i) {
		System.out.println("String: " + s + ", int: " + i);
	}
	public static void main(String[] args) {
		f(99, "Int first");
		f("String first", 11);
	}
} ///:~
