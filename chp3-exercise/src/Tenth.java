//: Tenth.java
// This is the tenth exercise of chapter3

public class Tenth {
	static void prt(String  s, int i) {
		System.out.println(s + ", int : " + i + ", binary:\n    " + 
				Integer.toBinaryString(i));
}
	public static void main(String[] args) {
		int a = 0xAAAAAAAA;
		int b = 0x55555555;
		prt("a & b: ", a & b);
		prt("a | b: ", a | b);
		prt("a ^ b: ", a ^ b);
		prt("~a: ", ~a);
		prt("~b: ", ~b);
	}
}
