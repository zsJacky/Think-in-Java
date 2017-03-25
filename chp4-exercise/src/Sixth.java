//: Sixth.java
// This is the sixth exercise of chapter4

public class Sixth {
	static int result = 0;
	static void test(int testval, int begin, int end) {
		if(testval > begin && testval < end)
			result = +1;
		else if(testval < begin || testval > end)
			result = -1;
		else
			result = 0;	
	}
	public static void main(String[] args) {
		test(10, 5, 15);
		System.out.println(result);
		test(15, 5, 15);
		System.out.println(result);
		test(4, 5, 10);
		System.out.println(result);
	}
} ///:~
