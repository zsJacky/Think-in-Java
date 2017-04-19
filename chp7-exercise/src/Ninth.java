//: Ninth.java
// This is the ninth exercise of the chapter7.

class PrintOut {
	PrintOut(Object obj) { System.out.println(obj); }
}

class Component1 {
	Component1() { new PrintOut("Component1"); }
}

class Component2 {
	Component2() { new PrintOut("Component2"); }
}

class Root {
	Component1 c1 = new Component1();
	Component2 c2 =new Component2();
	Root() { new PrintOut("Root"); }
}

class Steam extends Root {
	Component1 c1 = new Component1();
	Component2 c2 =new Component2();
	Steam() { new PrintOut("Steam"); }
}

public class Ninth {
	public static void main(String[] args) {
		new Root();
		new Steam();
	}
}
