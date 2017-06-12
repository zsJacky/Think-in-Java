// Fourteenth.java of chapter9 exercise

interface A {
	void print();
	void play();
}

interface B {
	void turnLeft();
	void turnRight();
}

interface C {
	void turnSouth();
	void turnNorth();
}

interface D extends A, B, C {
	void show();
}

class BaseClass {}

public class Fourteenth extends BaseClass implements D {
	void doFirst(A a) {
		System.out.println("interface A()");
	}
	void doSecond(B b) {
		System.out.println("interface B()");
	}
	void doThird(C c) {
		System.out.println("interface C()");
	}
	void doFourth(D d) {
		System.out.println("interface D()");
	}	
	public void print() {}
	public void play() {}
	public void turnLeft() {}
	public void turnRight() {}
	public void turnSouth() {}
	public void turnNorth() {}
	public void show() {}
	
	public static void main(String[] args) {
		Fourteenth fourteen = new Fourteenth();
		fourteen.doFirst(fourteen);
		fourteen.doSecond(fourteen);
		fourteen.doThird(fourteen);
		fourteen.doFourth(fourteen);
	}
}

// Fifteenth.java
//abstract class E {
//	abstract void printE(E e);
//}
//
//public class Fourteenth extends E {
//	void printE(E e) {
//		System.out.println("abstract class E");
//	}
//	public static void main(String[] args) {
//		Fifteenth fifteen = new Fifteenth();
//		fifteen.printE(fifteen);
//	}
//}








