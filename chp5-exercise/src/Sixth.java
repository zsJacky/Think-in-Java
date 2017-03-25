//: Sixth.java
// This is the sixth exercise of the chapter5.

class Dog2 {
	Dog2() {}
	void bark(double d, String s) {
		System.out.println(+ d + " barking " + s);
	}
	void bark(String s ,double f) {
		System.out.println(s + " howling " + f);
	}
}
public class Sixth {
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.bark(3, "int first");
		d.bark("string first", 2.3);
	}
}
