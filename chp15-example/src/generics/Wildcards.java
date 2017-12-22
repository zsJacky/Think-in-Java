// exploring the meaning of wildcards

package generics;

public class Wildcards {
	// raw argument
	static void rawArgs(Holder holder, Object arg) {
		holder.set(arg);	// warning: uchecked call to set(T) as a member of the raw type Holder
		holder.set(new Wildcards());	// same warning
		
		// can't do this; don't have any 'T'
		T t = holder.get();
		
		// ok, but type information has been lost
		Object obj = holder.get();
	}
	// similar to rawArgs(), but errors instead of warnings:
	static void unboundedArg(Holder<?> holder, Object arg) {
		holder.set(arg);	// error: set(capture of ?) in Holder<capture of ?> cannot be applied to (Object)
		holder.set(new Wildcards());	// same error
		
		// can't do this; don't have any 'T'
		T t = holder.get();
				
		// ok, but type information has been lost
		Object obj = holder.get();
	}
	static <T> T exact1(Holder<T> holder) {
		T t = holder.get();
		return t;
	}
	static <T> T exact2(Holder<T> holder, T arg) {
		holder.set(arg);
		T t = holder.get();
		return t;
	}
	static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
//		holder.set(arg);	// error: set(capture of ?) in Holder<capture of ?> cannot be applied to (T)
		T t = holder.get();
		return t;
	}
	static <T> T wildSupertype(Holder<? super T> holder, T arg) {
		holder.set(arg);
		T t = holder.get();	// error: incompatible types: found Object, required T
		
		// ok, but type information has been lost
		Object obj = holder.get();
	}
	
	public static void main(String[] args) {
		Holder raw = new Holder<Long>();
		// or
		raw = new Holder();
		Holder<Long> qualified = new Holder<Long>();
		Holder<?> unbounded = new Holder<Long>();
		Holder<? extends Long> bounded = new Holder<Long>();
		Long lng = 1L;
		
		rawArgs(raw, lng);
		rawArgs(qualified, lng);
		rawArgs(unbounded, lng);
		rawArgs(bounded, lng);
		
		unboundedArg(raw, lng);
		unboundedArg(qualified, lng);
		unboundedArg(unbounded, lng);
		unboundedArg(bounded, lng);
		
		// warnings: unchecked conversion from Holder to Holder<T>
		// unchecked method invocation: exaxt1(Holder<T>) is applied to (Holder)
		Object r1 = exact1(raw); 
		Long r2 = exact1(qualified);
		Object r3  = exact1(unbounded);	// must return Object
		Long r4 = exact1(bounded);
		
		// warnings: unchecked conversion from Holder to Holder<Long>
		// unchecked method invocation: exaxt2(Holder<T>, T) is applied to (Holder, Long)
		Long r5 = exact2(raw, lng); 
		Long r6 = exact2(qualified, lng);
		Long r7 = exact2(unbounded, lng);	// error: exact2(Holder<T>, T) cannot be applied to (Holder<capture of ? extends Long>, Long)
		Long r8 = exact2(bounded, lng);	// error: exact2(Holder<T>, T) cannot be applied to (Holder<capture of ? extends Long>, Long)

		// warnings: unchecked conversion from Holder to Holder<? extends Long>
		// unchecked method invocation: wildSubtype(Holder<? extends T>, T) is applied to (Holder, Long)
		Long r9 = wildSubtype(raw, lng);
		Long r10 = wildSubtype(qualified, lng);
		// OK, but only return Object
		Object r11 = wildSubtype(unbounded, lng);
		Long r12 = wildSubtype(bounded, lng);
		
		// warnings: unchecked conversion from Holder to Holder<? super Long>
		// unchecked method invocation: wildSubtype(Holder<? super T>, T) is applied to (Holder, Long)
		wildSupertype(raw, lng);
		wildSupertype(qualified, lng);
		// error: wildSupertype(Holder<? super T>, T) cannot be applied to
		// (Holder<capture of ?>, Long)
		wildSupertype(unbounded, lng);
		// error: wildSupertype(Holder<? super T>, T) cannot be applied to
		// (Holder<capture of ? extends Long>, Long)
		wildSupertype(bounded, lng);		
	}
}
