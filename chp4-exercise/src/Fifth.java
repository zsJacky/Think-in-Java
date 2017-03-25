//: Fifth.java
// This is the fifth exercise of chapter4

public class Fifth {
	public static void main(String[] args) {
		int a = 0xAAAAAAAA;
		int b = 0x55555555;
		pBinInt("a & b: ", a & b);
		pBinInt("a | b: ", a | b);
		pBinInt("a ^ b: ", a ^ b);
		pBinInt("~a: ", ~a);
		pBinInt("~b: ", ~b);
	}
	static void pBinInt(String s, int i) {
		System.out.println(
			s + ", int: " + i + ", binary: ");
		System.out.print(" ");
		for(int j = 31; j >=0; j--)
			if(((1 << j) & i) != 0)
				System.out.print("1");
			else
				System.out.print("0");
		System.out.println();
	}
}
