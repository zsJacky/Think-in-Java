package exercise;

public class Eighteenth {
	static class InnerEighteenth {
		void print() {
			System.out.println("static class inner Eighteenth");
		}
	}
	
	public static void main(String[] args) {
		InnerEighteenth ie = new InnerEighteenth();
		ie.print();
	}
}
