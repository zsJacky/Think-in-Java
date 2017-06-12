// theth.java of chapter9 exercise

interface Playable {
	void play(Note n);
}

interface Instrument2 {
	// compile-time constant
	int VALUE = 5;	// static & final
	// cannot have method definitions
	void adjust();
}

class Wind2 implements Instrument2, Playable {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() {
		return "Wind";
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Percussion2 implements Instrument2, Playable {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() {
		return "Percussion";
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Stringed2 implements Instrument2, Playable{
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() {
		return "Stringed";
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Brass2 extends Wind2 {
	public String toString() {
		return "Brass";
	}
}

class Woodwind2 extends Wind2 {
	public String toString() {
		return "Woodwind";
	}
}

public class Tenth {
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
