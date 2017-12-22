package generics;

import java.lang.reflect.*;

public class GenericArrrayWithTypeToken<T> {
	private T[] array;
	@SuppressWarnings("unchecked")
	public GenericArrrayWithTypeToken(Class<T> type, int sz) {
		array = (T[])Array.newInstance(type, sz);
	}
	public void put(int index, T item) {
		array[index] = item;
	}
	public T get(int index) {
		return array[index];
	}
	// expose the underlying representation
	public T[] rep() {
		return array;
	}
	public static void main(String[] args) {
		GenericArrrayWithTypeToken<Integer> gai =
			new GenericArrrayWithTypeToken<Integer>(
				Integer.class, 10);
		// this work
		Integer[] ia = gai.rep();
	}
}
