//: Seventh.java
// This is the seventh exercise of chapter3.
import java.util.*;

public class Seventh {
	static void prt(String s) {
		System.out.println(s);
}
	public static void main(String[] args) {
		Random rand = new Random();
		int i = rand.nextInt() % 100;
		int j = rand.nextInt() % 100;
		if (i > j)
			prt("coin is up");
		else
			prt("coin is down");
	}
} 
