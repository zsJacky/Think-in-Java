package polymorphism.music3;

/*
 * exercise6, exercise7, exercise8
 */


import java.util.Random;

import polymorphism.music.Note;
import polymorphism.shape.Circle;
import polymorphism.shape.Shape;
import polymorphism.shape.Square;
import polymorphism.shape.Triangle;

class Instrument {
	void play(Note n) {
		System.out.println("Intrument.play() " + n);
	}
	String what() {
		return "Intrument";
	}
	void adjust() {
		System.out.println("Adjusting Instrument");
	}
	
	// exercise6：重载toString方法，在toString方法中调用what方法
	public String toString() {
		return what();
	}
}

class Wind extends Instrument {
	void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
	String what() {
		return "Wind";
	}
	void adjust() {
		System.out.println("Adjusting WInd");
	}
}

class Percussion extends Instrument {
	void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}
	String what() {
		return "Percussion";
	}
	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}


class Stringed extends Instrument {
	void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}
	String what() {
		return "Stringed";
	}
	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Wind {
	void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
	void adjust() {
		System.out.println("Adjusting Brass");
	}
}

class Woodwind extends Wind {
	void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}
	void adjust() {
		System.out.println("Adjusting Woodwind");
	}
}

// exercise7：添加新类型newInstrument
class newInstrument extends Instrument {
	@Override
	void play(Note n) {
		System.out.println("newInstrument.play() " + n);
	}
}

// exercise8： 随机创建Instrument对象
class RandomInstrumentGeneraor {
	private Random rand = new Random(47);
	public Instrument next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Wind();
			case 1: return new Percussion();
			case 2: return new Stringed();
			case 3: return new Brass();
			case 4: return new Woodwind();
			case 5: return new newInstrument();
		}
	}
}


public class Music3 {
	// doesn't care about type, so new types 
	// addes to the system still work right
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e) 
			tune(i);
	}
	
	public static void main(String[] args) {
		// upcasting during addition to the array
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind(),
		};
		
		newInstrument ni = new newInstrument();
		ni.play(Note.B_FLAT);
		
		tuneAll(orchestra);
		
		// exercise6: 输出Instrument对象
		for (Instrument i : orchestra)
			System.out.println(i);
	}
}






