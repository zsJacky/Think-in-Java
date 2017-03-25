//: Fourth.java
// This is the fourth exercise of chapter3.
import java.util.Random;

public class Fourth {
	static void prt(String s) {
		System.out.println(s);
}
	public static void main(String[] args) {
		Random rand = new Random();
		float j, k;
		j = rand.nextFloat();
		k = rand.nextFloat();
		prt(" vector is: " + j / k);
	}
} ///:~
