//: IFElse2.java

public class IfElse2 {
	static int test(int testval, int target) {
		if(testval > target)
			return  +1;
		else if(testval < target)
			return  -1;
		else
			return  0;	
	}
	public static void main(String[] args) {
		System.out.println(test(10, 5));
		//test(15, 20);
		System.out.println(test(5, 15));
		//test(10, 10);
		System.out.println(test(5, 5));
	}
} ///:~
