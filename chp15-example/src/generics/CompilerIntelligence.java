package generics;

import java.util.*;

public class CompilerIntelligence {
	public static void main(String[] args) {
		List<? extends Fruit> flist =
			Arrays.asList(new Apple());
		Apple a = (Apple)flist.get(0); // no warning
		flist.contains(new Apple());	// argument is 'Object'
		flist.indexOf(new Apple());	// argument is 'Object'
	}
}
