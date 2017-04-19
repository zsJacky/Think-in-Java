//: Fourth.java
// This is the fourth exercise of the chapter7.

class One {
	One() { System.out.println("One constructor"); }
}

class Two extends One {
	Two() { System.out.println("Two constructor"); }
}

class Three extends Two {
	public Three(int i) { System.out.println("Four constructor: " + i); }
}

public class Fourth {
	public static void main(String[] args) {
		new Three(1);
	}
}
