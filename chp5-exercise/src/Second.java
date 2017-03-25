//: Second.java
// this is the second exercise of chapter5.

class S1 {
	String s = "abc";
	S1() {
		System.out.println(s);
	}
	S1(String s) {
		System.out.println(s);
	}
}

public class Second {

	public static void main(String[] args) {
		S1 s1 = new S1();
		S1 s2 = new S1("Bob");
//		System.out.println(s1.s);
//		System.out.println(s2.s);
	}
} ///:~
