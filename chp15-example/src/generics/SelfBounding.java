package generics;

class SelfBounded<T extends SelfBounded<T>> {
	T element;
	SelfBounded<T> set(T arg) {
		element = arg;
		return this; 
	}
	T get() { return element; }
}

class A extends SelfBounded<A> {}
class B extends SelfBounded<A> {}	// also OK

class C extends SelfBounded<C> {
	C setAndGet(C arg) { set(arg); return get(); }
}

class D {}

// compile error: type parameter D is not within its bound
class E extends SelfBounded<D> {}

// alas, you can do this, so you can't force the idiom
class F extends SelfBounded {}

public class SelfBounding {
	public static void main(String[] args) {
		A a = new A();
		a.set(new A());
		a = a.set(new A()).get();
		a = a.get();
		C c = new C();
		c = c.setAndGet(new C());
	}
}
