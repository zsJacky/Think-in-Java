//: Second.java
// This is the second exercise of chapter3
// assignment with objects is a bit tricky

class SecondTestClass {
	float i;
}

public class Second {
	public static void main(String[] args) {
		SecondTestClass n1 = new SecondTestClass();
		SecondTestClass n2 = new SecondTestClass();
		n1.i = (float) 9.3;
		n2.i = (float) 47.2;
		System.out.println("1: n1.i: " + n1.i +
				", n2.i: " + n2.i);
		
		n1.i = n2.i;
		n2.i = (float) 23.6;
		System.out.println("2: n1.i: " + n1.i +
						", n2.i: " + n2.i);
		n1 = n2;
		System.out.println("2: n1.i: " + n1.i +
				", n2.i: " + n2.i);
		n1.i = (float) 27.5;
		System.out.println("3: n1.i: " + n1.i +
				", n2.i: " + n2.i);
	}
} 