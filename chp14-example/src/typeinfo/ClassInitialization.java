package typeinfo;

import com.sun.java_cup.internal.runtime.Symbol;

import java.util.*;

class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = 
		ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializing Initable");
	}
}

class Initable2 {
	static int staticNonFinal = 147;
	static {
		System.out.println("Initializing Initable2");
	}
}

class Initable3 {
	static int staticNonFinal = 74;
	static {
		System.out.println("Initializing Initable3");
	}
}

public class ClassInitialization {
	public static Random rand = new Random(47);
	public static void main(String[] args) throws Exception {
		Class initable = Initable.class;
		System.out.println("After creatinf Initable ref");
		// does not trigger initialization
		System.out.println(Initable.staticFinal);
		// does triger initialization
		System.out.println(Initable.staticFinal2);
		// does triger initialization
		System.out.println(Initable2.staticNonFinal);
		Class initable3 = Class.forName("typeinfo.Initable3");	//通过forName创建Class对象会初始化类
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
	}
}
