// no latent typing in Java

package generics;

import typeinfo.pets.*;
import static net.mindview.util.Print.*;

class PerformingDog extends Dog implements Performs {
	public void speak() { print("Woof!"); }
	public void sit() { print("Sitting"); }
	public void reproduce() {}
}

class Robot implements Performs {
	public void speak() { print("CLick!"); }
	public void sit() { print("Clank!"); }
	public void oilChange() {}
}

class Communicate {
	public static <T extends Performs> void perform(T perform) {
		perform.speak();
		perform.sit();
	}
}

public class DogsAndRobots {
	public static void main(String[] args) {
		PerformingDog d = new PerformingDog();
		Robot r = new Robot();
		Communicate.perform(d);
		Communicate.perform(r);
	}
}
