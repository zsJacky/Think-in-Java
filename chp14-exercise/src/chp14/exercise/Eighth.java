package chp14.exercise;

class A {}

class B extends A {}

class C extends B {}


public class Eighth {
	public static void printSuperClass(Class obj) {
//		Class className = obj.getClass();
		if( obj != null && obj.getName() != "java.lang.Object") {
			System.out.println(obj.getName());
			printSuperClass(obj.getSuperclass());
		} else {
			System.out.println("java.lang.Object");
		}
	}
	
	public static void main(String[] args) {
		C c = new C();
		Object obj = new Integer(9);
		printSuperClass(c.getClass());
	}
}
