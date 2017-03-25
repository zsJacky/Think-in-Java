//: Eleventh.java
// This is the eleventh exercise of chapter 2.

class AllTheColorOfTheRainbow {
	int anIntegerRepresentingColors = 0;
	int hue = 0;
	void changeTheHueOfTheColor (int newHue) {
		this.hue = newHue;
	}
}

public class Eleventh {
	public static void main(String[] args) {
		AllTheColorOfTheRainbow aCR = new AllTheColorOfTheRainbow();
		System.out.println("aCR.anIntegerPepresentingColors = "+ aCR.anIntegerRepresentingColors);
		System.out.println("aCR.hue = "+ aCR.hue);
		aCR.changeTheHueOfTheColor(15);
		System.out.println("aCR.hue = "+ aCR.hue);
	}
}
