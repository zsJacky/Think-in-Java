//: Eighth.java
// This is the eighth exercise of chapter 2.

class StaticTestEighth {
	static int i = 47;
}

class IncrementableEighth {
	static void increment() {StaticTestEighth.i++;}
}

public class Eighth {
	public static void main(String[] args) {
		System.out.print("i 的初始值是： ");
		System.out.println("StaticTest.i = " + StaticTestEighth.i);
		StaticTestEighth st1 = new StaticTestEighth();
		StaticTestEighth st2 = new StaticTestEighth();
		StaticTestEighth st3 = new StaticTestEighth();
		System.out.println("st1.i = "+ st1.i);
		System.out.println("st2.i = "+ st2.i);
		System.out.println("st3.i = "+ st3.i);
	}
}
