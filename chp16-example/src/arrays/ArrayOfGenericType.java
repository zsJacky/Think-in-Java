// arrays of generic types won't compile

package arrays;

public class ArrayOfGenericType<T> {
	T[] array;	// OK
	@SuppressWarnings("unchecked")
	public ArrayOfGenericType(int size) {
//		array = new T[size];	// illegal
		array = (T[])new Object[size];	// unchecked warning
	}
	// illegal
	public <U> U[] makeArray() { return new U[10]; }
}
