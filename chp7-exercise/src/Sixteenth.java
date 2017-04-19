//: Sixteenthth.java
// This is the Sixteenth exercise of the chapter7.

class Amphibian {
	static void sayHello(Amphibian a) {
		System.out.println("amphibian()");
	}
}

class Frog extends Amphibian { }

public class Sixteenth {
	public static void main(String[] args) {
		Frog f = new Frog();
		Amphibian.sayHello(f);
	}
}
