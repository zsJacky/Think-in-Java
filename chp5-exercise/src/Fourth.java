//:  Fourth.java
// This is the fourth exercise of the chapter5

class  Bird2 {
	Bird2() {
		System.out.println("This calss has default constructor");
	}
	Bird2(String s) {
		System.out.println(s);
	}
}
	

public class Fourth {
	public static void main(String[] args) {
		Bird2 b = new Bird2();
		Bird2 b2 = new Bird2("This constructor take augument");
	}
} ///:~
