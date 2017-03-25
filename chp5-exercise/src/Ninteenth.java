//: Ninteenth.java
// This is the ninteenth exercise of the chapter5.
public class Ninteenth {
	static void f(String... args) {
		for(String s : args)
			System.out.print(s + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		f("first", "second", "third");
		f(new String[]{"fouth", "fift", "sixth"});
	}
}
