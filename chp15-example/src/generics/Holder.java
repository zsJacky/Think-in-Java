package generics;

public class Holder<T> {
	private T value;
	public Holder() {}
	public Holder(T val) { value = val; }
	public void set(T val) { value = val; }
	public T get() { return value; }
	public boolean equals(Object obj) {
		return value.equals(obj);
	}
	public static void main(String[] args) {
		Holder<Apple> apple = new Holder<Apple>(new Apple());
		Apple d = apple.get();
		apple.set(d);
		Holder<Fruit> fruit = apple;	// cannot upcast
		Holder<? extends Fruit> fruit2 = apple;	// ok
		Fruit p = fruit2.get();
		d = (Apple)fruit2.get();	// returns Object
		try {
			Orange c = (Orange)fruit2.get();	// no warning
		} catch(Exception e) { System.out.println(e); }
		fruit2.set(new Apple());	// cannot call set()
		fruit2.set(new Fruit());	// cannot call set()
		System.out.println(fruit.equals(d));
	}
}
