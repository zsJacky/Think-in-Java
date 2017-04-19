//: Sixth.java
// This is the sixth exercise of the chapter7.

class Game {
	Game() {
		System.out.println("Game constructos without argument");
	}
	Game(int i) { 
		System.out.println("Game constructos " + i); 
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructos " + i);
	}
}

class Chess extends BoardGame {
	Chess(int i) {
//		super(i);
		System.out.println("Chess constructos");
		
	}
}
public class Sixth {
	public static void main(String[] args) {
		new Chess(11);
	}
}
