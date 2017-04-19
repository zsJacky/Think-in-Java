//: Thirteenthth.java
// This is the thirteenth exercise of the chapter7.

class M {
	char apple(char c) {
		System.out.println("apple(char)");
		return 'c';
	}
	String apple(String c) {
		System.out.println("apple(string)");
		return "Hello";
	}
	int apple(int c) {
		System.out.println("apple(int)");
		return 1;
	}
}

class N extends M {
	float apple(float c) {
		System.out.println("apple(float)");
		return 1.0f;
	}
}
public class Thirteenth {
	public static void main(String[] args) {
		N n = new N();
		n.apple('c');
		n.apple("c");
		n.apple(1);
		n.apple(1.0f);
	}
}
