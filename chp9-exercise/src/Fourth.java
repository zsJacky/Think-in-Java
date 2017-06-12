// fourth.java of chapter9 exercise

abstract class FourthAbstractClass {
	abstract void print();
}

public class Fourth extends FourthAbstractClass {
	public void print() {
		System.out.println("Fourth.print()");
	}
	public static void staticMethod(FourthAbstractClass f) {
		((Fourth)f).print();
	}
	public static void main(String[] args) {
		new Fourth().staticMethod(new Fourth());
	}
}
