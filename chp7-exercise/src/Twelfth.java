//: Twelfth.java
// This is the twelfth exercise of the chapter7.

class Print {
	Print(Object obj) { System.out.println(obj); }
}

class ComponentA {
	ComponentA() { new Print("ComponentA"); }
	void dispose() { new Print("Erasing ComponentA"); }
}

class ComponentB {
	ComponentB() { new Print("ComponentB"); }
	void dispose() { new Print("Erasing ComponentB"); }
}

class RootA {
	ComponentA c1 = new ComponentA();
	ComponentB c2 =new ComponentB();
	RootA() { new Print("RootA"); }
	void dispose() { 
		c2.dispose();
		c1.dispose();
		new Print("Erasing RootA"); }
}

class SteamA extends RootA {
	ComponentA c1 = new ComponentA();
	ComponentB c2 =new ComponentB();
	SteamA() { new Print("SteamA"); }
	void dispose() {
		c2.dispose();
		c1.dispose();
		new Print("Erasing SteamA");
		super.dispose();
	}
}

public class Twelfth {
	public static void main(String[] args) {
		SteamA x = new SteamA();
		try {

		} finally {
			x.dispose();
		}
	}

}
