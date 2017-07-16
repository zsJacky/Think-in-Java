package holding;

import java.util.*;

public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++)
			apples.add(new Apple());
		// compile time error
//		apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++)
			System.out.println(apples.get(i).id());
		// using foreach
		for (Apple c : apples)
			System.out.println(c.id());
	}
}
