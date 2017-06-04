package polymorphism.music;

public class Wind extends Instrument {
	// redefine interface method
	public  void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
}
