//: Twenty-First.java
// This is the Twenty-First exercise of the chapter7.

class ClassWithFinalMethod {
	final void FinalMethod() {
		System.out.println(ClassWithFinalMethod.class.getName());
	}
}
public class TwentyFirst extends ClassWithFinalMethod {
	// can't override final method
	//final void FinalMethod() {
	//	System.out.println(TwentyFirst.class);
	//}
	public static void main(String[] args) {
		ClassWithFinalMethod cw = new ClassWithFinalMethod();
		cw.FinalMethod();
	}
}
