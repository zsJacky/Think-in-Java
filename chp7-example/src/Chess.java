//: Chess.java
// Inheritance, constructrs and arugments

class Game {
	Game(int i) { 
		System.out.println("Game constructos"); 
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructos");
	}
}

public class Chess extends BoardGame {
	Chess() {
		super(11);
		System.out.println("Chess constructos");
	}
	public static void main(String[] args) {
		Chess x = new Chess();
	}
}
