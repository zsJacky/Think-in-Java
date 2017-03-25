//: assignment.java
//assignment with objects is a bit tricky

class Tank {
	int level;
}

public class Assignment {
	public static void main(String[] args) {
		Tank n1 = new Tank();
		Tank n2 = new Tank();
		n1.level = 9;
		n2.level = 47;
		System.out.println("1: n1.level: " + n1.level +
				", n2.level: " + n2.level);
		n1 = n2;
		System.out.println("2: n1.level: " + n1.level +
				", n2.level: " + n2.level);
		n1.level = 27;
		System.out.println("3: n1.level: " + n1.level +
				", n2.level: " + n2.level);
	}
} ///:~
