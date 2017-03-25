//: Seventh.java
// This is the seventh exercise of chapter 2.

class StaticTest {
	static int i = 47;
}

class Incrementable {
	static void increment() {StaticTest.i++;}
}

public class Seventh {
	public static void main(String[] args) {
		//System.out.print(StaticTest.i + " ");
		StaticTest st = new StaticTest();
		//System.out.print(st.i + " ");
		Incrementable sf = new Incrementable();
		while (st.i < 55) {
			sf.increment();
			System.out.print(st.i + " ");
		}
	}
}
