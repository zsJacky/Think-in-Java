// testing class Class

package typeinfo.toys;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
	// comment out the following default constructor
	// to see NoSuchMethodError from (*1*)
	//Toy() {}
	Toy(int i) {}
}


class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
	FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		System.out.println("Class name: " + cc.getName() + 
				" is interface? [" + cc.isInterface() + "]");
		System.out.println("Simple name: " + cc.getSimpleName());
		System.out.println("Canonical name : " + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("typeinfo.toys.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("Can't find FancyToy");
			System.exit(1);
		}
		Class c2 = null;
		try {
			c2 = Class.forName("typeinfo.toys.Toy");
		} catch (ClassNotFoundException e) {
			System.out.println("Can't find Toy");
			System.exit(1);
		}
		
		printInfo(c);
		printInfo(c2);
		for (Class face : c.getInterfaces())
			printInfo(face);
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			// requires default constructor
			obj = up.newInstance();
		} catch (InstantiationException e) {
			System.out.println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}
