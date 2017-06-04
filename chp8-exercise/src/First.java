//: First.java
// This is the first exercise of the chapter8.

// Fifth.java
// 在Cycle类及其子类中添加wheels方法，并在ride中调用wheels方法，在主类中验证多态起作用了。

class Cycle {
	public int wheels() {
		return 1;
	}
}

class Unicycle extends Cycle {
	public int wheels() {
		return 2;
	}
}

class Bicycle extends Cycle {
	public int wheels() {
		return 3;
	}
}

class Tricycle extends Cycle {
	public int wheels() {
		return 4;
	}
}

public class First {
	public static void ride(Cycle c) {
		System.out.println(c.getClass().getName() +  " " +c.wheels());
	}
	
	public static void main(String[] args) {
		Unicycle uc = new Unicycle();
		Cycle c = new Unicycle();
//		Unicycle uc2 = (Unicycle) new Cycle();
		Bicycle bc = new Bicycle();
		Tricycle tc = new Tricycle();
		
		First.ride(uc);
		First.ride(new Unicycle());
		First.ride(bc);
		First.ride(tc);
	}
}






