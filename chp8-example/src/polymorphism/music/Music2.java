package polymorphism.music;

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed.play()" + n);
	}
}

class brass extends Instrument {
	public void play(Note n) {
		System.out.println("Brass.play()" + n);
	}
}

public class Music2 {

}
