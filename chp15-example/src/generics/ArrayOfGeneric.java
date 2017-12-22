package generics;

public class ArrayOfGeneric {
	static final int SIZE = 100;
	static Generic<Integer>[] gia;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// compiles: produces ClassCaseException
		gia = (Generic<Integer>[])new Object[SIZE];
		// runtime type is the raw (erased) type
		gia = (Generic<Integer>[])new Generic[SIZE];
		System.out.println(gia.getClass().getSimpleName());
		gia[0] = new Generic<Integer>();
		gia[1] = new Object();	// compile error
		// discovers type mismatch at compile time
		gia[2] = new Generic<Double>();
	}
}
