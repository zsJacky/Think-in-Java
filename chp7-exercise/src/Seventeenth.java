//: Seventeenthth.java
// This is the Seventeenth exercise of the chapter7.

class Frog extends Amphibian {
	static void sayHello(Frog f) {
		System.out.println("frog()");
	}
}

public class Seventeenth {
	public static void main(String[] args) {
		Frog f = new Frog();
		Amphibian.sayHello(f);
	}
}
