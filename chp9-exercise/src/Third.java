// third.java of chapter9 exercise

abstract class ThirdAbstractClass {
	public ThirdAbstractClass() {
		print();
	}
	abstract public void print();
}


public class Third extends ThirdAbstractClass {
	int i = 9;
	public void print() {
		System.out.println("i is " + i);
	}
	public static void main(String[] args) {
		Third third = new Third();
		third.print();
	}
}
