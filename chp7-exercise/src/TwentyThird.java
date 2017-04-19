//: TwentyThird.java
// This is the twenty-third exercise of the chapter7.

class A2 {
	static int j = printInit("A2.j initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 1;
	}
	A2() {
		System.out.println("A2() constructor");
	}
	public String toString() {
		return "print A2";
	}
}

class B2 extends A2 {
	static int k = printInitB("B2.k initialized");
	static int n = 0;
	B2() {
		System.out.println("B2() constructor");
	}
	
	static int printInitB(String s) {
		B2.n++;
		System.out.println(s);
		//System.out.println(n);
		
		return 1;
	}
}


public class TwentyThird extends B2 {
	public static void main(String[] args) {
		// 先初始化静态数据和构造器
		System.out.println("hi");
		B2 b = new B2();
		
		// 调用静态方法，输出n的值
		B2.printInitB("hello world");
		System.out.println(B2.n);
		System.out.println();
		// 创建另一个B2对象，两次输出的n一样。
		new B2();
		System.out.println(B2.n);
	}
}