//: Fifth.java
// This is the fifth exercise of the chapter5.

class Dog {
	//Dog() {}
	void bark(int d) {
		System.out.print("int: " + "");
		System.out.print("barking ");
		System.out.println("howling");
	}
	void bark(double f) {
		System.out.print("double: " + "");
		System.out.print("barking ");
		System.out.println("howling");
	}
	void bark(String s) {
		System.out.print("str: " + "");
		System.out.print("barking ");
		System.out.println("howling");
	}
}
public class Fifth {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark(3);
		d.bark(2.3);
		d.bark("hello");
	}
}
