package exercise;

interface runnable {
	void run();
}

public class Eleventh {
	private class InnerClass implements  runnable {
		public void run() {
			System.out.println("inner class could run");
		}
	}
	
	public runnable getInner() {
		return new InnerClass();
	}
	
	public static void main(String[] args) {
		Eleventh eleven = new Eleventh();
		runnable i = eleven.getInner();
		i.run();
	}
}
