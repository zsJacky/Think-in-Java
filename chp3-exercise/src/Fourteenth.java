//: Fourteenth.java
// This is the fourteenth exercise of chapter3

public class Fourteenth {
	public static boolean f(boolean b) { 
		return b;
	}
	
	public static void compareString(String a, String b) {
		f(a == b);
		f(a != b);
		f(a.equals(b));
	}

	public static void main(String[] args) {
		String a = "hello";
		String b= "hello";
		compareString(a, b);
	}

}
