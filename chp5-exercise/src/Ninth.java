//: Ninth.java
// This is the Ninth exercise of the chapter5.

public class Ninth {
	int carNumber = 0;
	Ninth() {
		this("hello");
		System.out.println("default constructor ");
	}
	Ninth(String s) {
		System.out.println("string s: " + s);
	}
	public static void main(String[] args) {
		Ninth n = new Ninth();
	}
}
