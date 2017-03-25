//: Eighth.java
// This is the eighth exercise of chapter3

public class Eighth {
	static void prt(String  b) {
		System.out.println(b);
}
	public static void main(String[] args) {
		long i1 = 0x2fl;
		prt("i1: " + Long.toBinaryString(i1));
		long i2 = 0Xffff;
		prt("i2: " + Long.toBinaryString(i2));
		long i3 = 0177;
		prt("i3: " + Long.toBinaryString(i3));
	}
} ///:~
