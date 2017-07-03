package exercise;

interface flyable {
	void canFly();
}

public class Nineth {
	public flyable trackingFly(String s) {
		class InnerNineth implements flyable {
			public void canFly() {
				System.out.println(s);
			}
		}
		
		// Tenth.java
		if (s.equals("fly")) {
			class InnerTenth implements flyable {
				public void canFly() {
					System.out.println(s);
				}
			}
			return new InnerTenth();
		}
		
		return new InnerNineth();
	}
	public static void main(String[] args) {
		Nineth n = new Nineth();
		// Nineth.java
		n.trackingFly("flying").canFly();
		// Tenth.java
		n.trackingFly("fly").canFly();
	}
}
