package exercise;
// First.java and Third.java of chapter10 exercise

class Outer {
	private String outer;
	class Inner {
		public Inner() {
			System.out.println("Inner class");
		}
		public String toString() {
			return outer;
		}
	}
	
	public Outer() {
		outer = "Outer";
	}
	
	public Inner getInner() {
		return new Inner();
	}
}

public class First {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.getInner();
		System.out.println(i); 	// exercise 3
	}
}
