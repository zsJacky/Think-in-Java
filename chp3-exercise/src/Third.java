//: Third.java
// This is the third exercise of chapter3

class ThirdTestClass {
	float i;
}

public class Third {
	static void ThirdTestClass(ThirdTestClass m) {
		m.i =  (float) 5.3;
	}
	public static void main(String[] args) {
		ThirdTestClass n = new ThirdTestClass();
		n.i = (float) 6.5;
		System.out.println("1: n.i:" + n.i);
		ThirdTestClass(n);
		System.out.println("1: n.i:" + n.i);
	}
}
