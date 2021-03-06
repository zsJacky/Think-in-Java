package generics;

public class GenericArray<T> {
	private T[] array;
	@SuppressWarnings("unchecked")
	public GenericArray(int sz) {
		array = (T[])new Object[sz];
	}
	public void put(int index, T item) {
		array[index] = item;
	}
	public T get(int index) {
		return array[index];
	}
	// method that exposes the underlying representation
	public T[] rep() {
		return array;
	}
	public static void main(String[] args) {
		GenericArray<Integer> gai = 
			new GenericArray<Integer>(10);
		//this causes  a ClassCastException
		Integer[] ia = gai.rep();
		// this is ok
		Object[] oa = gai.rep();
	}
}
