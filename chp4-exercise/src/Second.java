//: Second.java
// This is the second exercise of chapter4
import java.util.*;

public class Second {
	public static void main(String[] args) {
		int b = 0;
		for(int i = 0; i < 25; i++) {
			int a = (new Random()).nextInt(100); 
			if(i == 0)
				System.out.println(a + " ");
			else {
				if(b == a)
					System.out.println(+ b + "=" + a + " ");
				else if(b < a)
					System.out.println(+ b + "<" + a + " ");
				else
					System.out.println(+ b + ">" + a + " ");	
			}
			b = a;
		}	
	}
} ///:~





