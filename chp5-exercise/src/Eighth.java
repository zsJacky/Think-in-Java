//: Eighth.java
// This is the eighth exercise of the chapter5.

public class Eighth {
	static int i = 0;
	Eighth eat() {
		i++;
		print();
		return this;
	}
	void print() {
		System.out.println("i = " + i);
	}
	public static void main(String[] args) {
		Eighth x = new Eighth();
		x.eat().eat();
	}
}

