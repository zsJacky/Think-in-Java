// using adapters to simulate latent typing

package generics;

import java.util.*;
import generics.coffee.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

interface Addable<T> { void add(T t); }

public class Fill2 {
	// Classtoken version
	public static <T> void fill(Addable<T> addable, Class<? extends T> classToken, int size) {
		for(int i = 0; i < size; i++)
			try {
				addable.add(classToken.newInstance());
			} catch(Exception e) {
				throw new RuntimeException();
			}
	}
	// Generator version
	public static <T> void fill(Addable<T> addable, Generator<T> generator, int size) {
		for(int i = 0; i < size; i++)
			addable.add(generator.next());
	}
}

// to adapt a base type, you must use composition.
// make any Collection Addable using composition
class AddableCollectionAdapter<T> implements Addable<T> {
	private Collection<T> c;
	public AddableCollectionAdapter(Collection<T> c) {
		this.c = c;
	}
	public void add(T item) { c.add(item); }
}
// a helper to capture the type automatically
class Adapter {
	public static <T> Addable<T> collectionAdapter(Collection<T> c) {
		return new AddableCollectionAdapter<T>(c);
	}
}

// to adapt a specific type, you can use inheritance
// make a SimpleQueue Addable using inheritance
class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T> {
	public void add(T item) { super.add(item); }
}

class Fill2Test {
	public static void main(String[] args) {
		// adapt a Collection
		List<Coffee> carrier = new ArrayList<Coffee>();
		Fill2.fill(
			new AddableCollectionAdapter<Coffee>(carrier), 
			Coffee.class, 3);
		// helper method captures the type
		Fill2.fill(Adapter.collectionAdapter(carrier),
			Latte.class, 2);
		for(Coffee c : carrier)
			print(c);
		print("-----------------------");
		// using an adapted class
		AddableSimpleQueue<Coffee> coffeeQueue =
			new AddableSimpleQueue<Coffee>();
		Fill2.fill(coffeeQueue, Mocha.class, 4);
		Fill2.fill(coffeeQueue, Latte.class, 1);
		for(Coffee c : coffeeQueue)
			print(c);
	}
}














