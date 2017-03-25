//: Eighth.java
// This is the eighth exercise of chapter4
import java.util.Random;

public class Eighth {
	static void print(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			int a = (new Random()).nextInt(100); 
			//System.out.println(a);
			int b = a / 10;
			//System.out.println(b);
			switch(b) {
				case 9: print("A");
						break;
				case 8: print("B");
						break;
				case 7: print("C");
						break;
				case 6: print("D");
						break;
				case 5:
				case 4:
				case 3:
				case 2:
				case 1:
				case 0:	print("E");
						break;
			}
		}
	}
}
