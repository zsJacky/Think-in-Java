//: Fifteenth.java
// This is the fifteenth exercise of the chapter5.

class Mug {
	Mug(String marker) {
		System.out.println("Mug(" + marker + ")");
	}
	void f(String marker) {
		System.out.println("f(" + marker + ")");
	}
}

public class Fifteenth {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug("hello mug1");
		mug2 = new Mug("hello mug2");
		System.out.println("mug1 & mug2 initialized");
	}
	Fifteenth() {
		System.out.println("Mugs()");
	}
	Fifteenth(String i) {
		System.out.println("Mugs(String)");
	}
	public static void main(String[] args) {
		System.out.println("Inside main()");
		new Fifteenth();
		System.out.println("new Mugs() completed");
		new Fifteenth("first");
		System.out.println("new Mugs(first) completed");
	}
}
