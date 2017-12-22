package generics;

import java.util.*;

public class NonCovariantGenerics {
	// compile error, incompatible types
	List<Fruit> flist = new ArrayList<Apple>();
}
