// it only looks lie you can override
// a private or private final method

class WithFinals {
	// identical to private alone

	private final void f() {
		System.out.println("Withfinals.f()");
	}
	// also automatically final
	private void g() {
		System.out.println("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	@Override
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}
	@Override
	private void g() {
		System.out.println("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	@Override
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}
	@Override
	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		// you can upcast
		OverridingPrivate op = op2;
		// but you ucan't call the methods
		op.f();
		op.g();
		// same here
		WithFinals wf = op2;
		wf.f();
		wf.g();
	}
}





