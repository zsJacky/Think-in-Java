// a Collection filled with data using a generator object

package containers;

import java.util.*;

public class CollectionData<T> extends ArrayList<T> {
	public CollectionData(Generator<T> gen, int quantity) {
		for(int i = 0; i < quantity; i++)
			add(gen.next());
	}
	// a generic convenience method
	public static <T> CollectionData<T> list(Generator<T> gen, int quantity){
		return new CollectionData<T>(gen, quantity);
	}

}
