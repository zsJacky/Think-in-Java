package generics;

import java.util.*;

public class SuperTypeWildcards {
	static void writeTo(List<? super Apple> apples) {
		apples.add(new Apple());
		apples.add(new Jonathan());
		// error
		apples.add(new Fruit());
		
	}
}
