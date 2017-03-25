//:  NoSynthesis.java

class  Bird2 {
	Bird2(int i) {}
	Bird2(double b) {}
}

public class NoSynthesis {
	public static void main(String[] args) {
		Bird2 b1 = new Bird2(1);
		Bird2 b2 = new Bird2(1.5);
	}
} ///:~
