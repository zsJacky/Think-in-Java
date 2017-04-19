//: Tenth.java
// This is the tenth exercise of the chapter7.

//class Print1 {
//	Print1(Object obj) { System.out.println(obj); }
//}

class Component11 {
	Component11(int i) { new PrintOut("Component11: " + i); }
}

class Component22 {
	Component22(int i) { new PrintOut("Component22: " + i); }
}

class Root1 {
	Component11 c1 = new Component11(1);
	Component22 c2 =new Component22(2);
	Root1(int i) { new PrintOut("Root1: " + i); }
}

class Steam1 extends Root1 {
	Component11 c1 = new Component11(3);
	Component22 c2 =new Component22(4);
	Steam1(int i) { 
		super(11);
		new PrintOut("Steam1: " + i); }
}

public class Tenth {
	public static void main(String[] args) {
		new Root1(11);
		new Steam1(22);
	}
}
