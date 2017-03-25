//: Fifth.java
// This is the fifth exercise of chapter3.

class Dog {
		String name;
		String says;
}

public class Fifth {
	static void prt(String s) {
		System.out.println(s);
}
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.name = "spot";
		d1.says = "Ruff!";
		d2.name = "scruff";
		d2.says = "Wurf!";
		prt("d1.name: " + d1.name + " d1.says: " + d1.says);
		prt("d2.name: " + d2.name + " d2.says: " + d2.says);
	}
}
