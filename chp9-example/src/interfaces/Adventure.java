// multiple interfaces
// Twelfth.java£¬Ìí¼ÓCanClimb½Ó¿Ú

package interfaces;

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

interface CanFight {
	void fight();
}

interface CanClimb {
	void climb();
}

class ActionCharacter {
	public void fight() {}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb{
	public void swim() {}
	public void fly() {}
	public void climb() {}
}

public class Adventure {
	public static void t(CanFight x) {
		x.fight();
	}
	public static void u(CanSwim x) {
		x.swim();
	}
	public static void v(CanFly x) {
		x.fly();
	}
	public static void w(ActionCharacter x) {
		x.fight();
	}
	public static void y(CanClimb x) {
		x.climb();
	}
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);	// treat it as a CanFight
		u(h);	// treat it as a canSwim
		v(h);	// treat it as a CanFly
		w(h);	// treat it as an ActionCharacter
		y(h);	// add CanClimb interface
	}
}







