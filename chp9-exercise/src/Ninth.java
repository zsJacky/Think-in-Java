// Ninth.java of chapter9 exercise

abstract class CommonMethod {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

interface Instrument {
	// compile-time constant
	int VALUE = 5;	// static & final
	// cannot have method definitions
	void play(Note n);	// automatically public
	void adjust();
}

class Wind extends CommonMethod implements Instrument {
	public String toString() {
		return "Wind";
	}
}

class Percussion extends CommonMethod implements Instrument {
	public String toString() {
		return "Percussion";
	}
}

class Stringed extends CommonMethod implements Instrument{
	public String toString() {
		return "Stringed";
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}

public class Ninth {
	// doesn't care about type, so new types
	// added to the system still work right
	static void tune(Instrument i) {
		i.play(new Note());
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}
}
