//: Eighth.java
// This is the eighth exercise of the chapter7.

class Homer {
	Homer(int i) {
		System.out.println("Homer() " + i);
	}
}

class Bart extends Homer {
	Bart() {
		super(11);
		System.out.println("Bart() "); }
	Bart(int i) {
		super(11);
		System.out.println("Bart() " + i); }
}
public class Eighth {
	public static void main(String[] args) {
		new Bart();
		new Bart(new Integer(11));
	}
}
