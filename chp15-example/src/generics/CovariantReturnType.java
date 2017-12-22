package generics;

class Base {}
class Derived extends Base {}

interface OrdinaryGetter {
	Base get();
}

interface DerivedGetter extends OridinaryGetter {
	// return type of overridden method is allow to vary
	Derived get();
}

public class CovariantReturnType {
	void test(DerivedGetter d) {
		Derived d2 = d.get();
	}
}








