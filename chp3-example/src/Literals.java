//: Literals.java

public class Literals {
	static void prt(String  b) {
		System.out.println(b);
}
	public static void main(String[] args) {
		int i1 = 0x2f;
		prt("i1: " + Integer.toBinaryString(i1));
		int i2 = 0X2F;
		prt("i2: " + Integer.toBinaryString(i2));
		int i3 = 0177;
		prt("i3: " + Integer.toBinaryString(i3));
		char c = 0xffff;
		prt("c: " + Integer.toBinaryString(c));
		byte b = 0x7f;
		prt("b: " + Integer.toBinaryString(b));
		short s = 0x7fff;
		prt("s: " + Integer.toBinaryString(s));
		long n1 = 200l;
		long n2 = 200l;
		long n3 = 200;
		float f1 = 1;
		float f2 = 1F;
		float f3 = 1F;
		double d1 = 1d;
		double d2 = 1D;
	}
} ///:~
