//: TernaryIfElse.java

public class TernaryIfElse {
	static void prt(int s) {
		System.out.println(s);
	}
	static int ternary(int i) {
		return i < 10 ? i * 100 : i * 10;
	}
	static int standardIfElse(int i) {
		if(i < 10)
			return i * 100;
		else
			return i * 10;
	}
	public static void main(String[] args) {
		prt(ternary(9));
		prt(ternary(10));
		prt(standardIfElse(9));
		prt(standardIfElse(10));
	}
} ///:~

