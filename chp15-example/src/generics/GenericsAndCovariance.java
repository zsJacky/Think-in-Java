package generics;

import java.util.*;

public class GenericsAndCovariance {
	public static void main(String[] args) {
		// wildcards allow covariance
		List<? extends Fruit> flist = new ArrayList<Apple>();
		// compile error: can't add any type of object
		flist.add(new Apple());
		flist.add(new Fruit());
		flist.add(new Object());
		flist.add(null);	// legal but uninteresting
		// we know that it returns at least Fruit
		Fruit f = flist.get(0);
	}
}
