package generics;

public class CaptureConversion {
	static <T> void f1(Holder<T> holder) {
		T t = holder.get();
		System.out.println(t.getClass().getSimpleName());
	}
	static <T> void f2(Holder<?> holder) {
		f1(holder);	// call with capture type
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Holder raw = new Holder<Integer>(1);
		f1(raw);	// produce warning
		f2(raw);	// no warning
		Holder rawBasic = new Holder();
		rawBasic.set(new Object());
		f2(rawBasic);
		// upcast to Holder<?>, still figures it out
		Holder<?> wildcarded = new Holder<Double>(1.0);
		f2(wildcarded);
	}
}
