//: Thirteenth.java
// This is the thirteenth exercise of chapter3

public class Thirteenth {
	public static void getBinaryFromChar(char c) {
		System.out.println(Integer.toBinaryString(c));
	}
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 'A';
		char c3 = 'Z';
		getBinaryFromChar(c1);
		getBinaryFromChar(c2);
		getBinaryFromChar(c3);
	}
}
