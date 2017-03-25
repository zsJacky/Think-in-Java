//: Third.java
// This is the third exercise of chapter4
import java.util.*;

public class Third {
	public static void main(String[] args) {
		int b = 0;
		int i = 0;
		while(i != -1) {
			int a = (new Random()).nextInt(100); 
			if(i == 0){
				System.out.println(a + " ");
			}
			else {
				if(b == a)
					System.out.println(+ b + "=" + a + " ");
				else if(b < a)
					System.out.println(+ b + "<" + a + " ");
				else
					System.out.println(+ b + ">" + a + " ");	
			}
			i++;
			b = a;
		}	
	}
} ///:~





