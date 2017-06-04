//: Ninth.java and Twelveth.java
// This is the ninth exercise of the chapter8.


class Rodent {
	private int damage;
	Rodent() {
		damage = 10;
		System.out.println("Rodent()");
	}
	public String retRodentName() {
		return "rodent " + damage + " ";
	}
}

class Mouse extends Rodent {
	private int damage2;
	Mouse() {
		damage2 = 100;
		System.out.println("Mouse()");
	}
	public String retRodentName() {
		return "mouse " + damage2 + " ";
	}
}

class Gerbil extends Rodent {
	private int damage3;
	Gerbil() {
		damage3 = 1000;
		System.out.println("Gerbil()");
	}
	public String retRodentName() {
		return "Gerbil " + damage3 + " ";
	}
}

class Hamster extends Rodent {
	private int damage4;
	Hamster() {
		damage4 = 10000;
		System.out.println("Hamster()");
	}
	public String retRodentName() {
		return "Hamster " + damage4 + " ";
	}
}


public class Ninth {
	Rodent r = new Rodent();
	Mouse m = new Mouse();
	Gerbil g = new Gerbil();
	Hamster h = new Hamster();
	
	public static void getRodent(Rodent r) {
		System.out.println(r.retRodentName() + r.getClass().getName());
	}
	public static void main(String[] args) {
		Rodent[] rd = {
			new Rodent(),
			new Mouse(),
			new Gerbil(),
			new Hamster()
		};
		for (Rodent r : rd)
			Ninth.getRodent(r);
	}
}
