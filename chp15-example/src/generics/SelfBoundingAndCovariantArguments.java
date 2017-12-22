package generics;

interface SelfBoundSetter<T extends SelfBoundSetter<T>> {
	void set(T arg);
}

interface Setter extends SelfBoundSetter<Setter> {}

public class SelfBoundingAndCovariantArguments {
	void testA(Setter s1, Setter s2, SelfBoundSetter sbs) {
		s1.set(s2);
		// error: set(Setter) in SelfBoundSetter<Setter> cannot be appplied to (SelfBoundSetter)
		// 只能接受Setter作为参数，为不能是SelfBoundSetter
		s1.set(sbs);
	}
}
