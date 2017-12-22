package generics;

class Manipulator<T> {
	private T obj;
	public Manipulator(T x) {
		obj = x;
	}
	// error: cannot find symbol: method f()
	public void manipulate() {
		obj.f();
	}
}

public class Manipulation {
	public static void main(String[] args) {
		HasF hf = new HasF();
		Manipulator<HasF> manipualtor =
			new Manipulator<HasF>(hf);
		manipualtor.manipulate();
	}
}
