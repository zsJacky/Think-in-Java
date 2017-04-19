//: Fourteenthth.java
// This is the fourteenth exercise of the chapter7.


class Engine {
	public void start() {}
	public void rev() {}
	public void stop() {}
	// answer of exercise fourteenth
	public void service() {
		System.out.println("service()");
	}
}

class Wheel {
	public void inflate(int psi) {}
}

class Window {
	public void rollup() {}
	public void rolldown() {}
}

class Door {
	public Window window = new Window();
	public void open() {}
	public void close() {}
}

public class Fourteenth {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door
		left = new Door(),
		right = new Door();
	public Fourteenth() {
		for(int i = 0; i < 4; i++) {
			
			wheel[i] = new Wheel();
		}
	}
	public static void main(String[] args) {
		Fourteenth car = new Fourteenth();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		// answer of exercise fourteenth
		car.engine.service();
	}
}


