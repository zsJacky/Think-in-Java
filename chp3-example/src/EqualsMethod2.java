//: EqualsMethod2.java

class Value {
	int i;
}

public class EqualsMethod2 {
	public static void main(String[] args) {
		Value n1 = new Value();
		Value n2 = new Value();
		n1.i = n2.i = 47;
		System.out.println(n1.equals(n2));
	}
} ///:~


