//: Eighteenth.java
// This is the eighteenth exercise of the chapter5.
import java.util.*;

//class Movies {
//	Movies(String s) {
//		System.out.println("Movies(" + s + ")");
//	}
//}

public class Eighteenth {
	public static void main(String[] args) {
		Movie[] mov = new Movie[] {
				new Movie("first"),
				new Movie("second"),
				new Movie("third"),
		};
		System.out.println(Arrays.toString(mov));
	}
}
