//: Sixth.java
// This is the sixth exercise of chapter3.

//class Dog {
//		String name;
//		String says;
//	}
public class Sixth {
	static void prt(boolean b) {
		System.out.println(b);
}
	public static void main(String[] args) {
		Dog n1 = new Dog();
		Dog n2 = new Dog();
		n1.name = "spot";
		n2.name = "spot";
		prt(n1.equals(n2));
		prt(n1 == n2);
	}
} ///:~
