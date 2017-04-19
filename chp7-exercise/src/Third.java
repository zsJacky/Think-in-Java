//: Third.java
// This is the third exercise of the chapter7.

class Art {
	Art() { System.out.println("Art constructor"); }
}

class Drawing extends Art {
	Drawing() { System.out.println("Drawing constructor"); }
}

public class Third extends Drawing {
	//public Third() { System.out.println("Cartoon constructor"); }
	public static void main(String[] args) {
		new Third();
	}
}
