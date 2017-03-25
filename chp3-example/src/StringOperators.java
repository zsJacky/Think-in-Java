//: StringOperators.java

public class StringOperators {
	static void prt(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		int x = 0, y = 1, z = 2;
		String s = "x, y, z ";
		prt(s + x + y + z);
		prt(x + " " + s);
		s += "(sumed) = ";
		prt(s + (x + y + z));
		prt("" + x);
	}
} ///:~
