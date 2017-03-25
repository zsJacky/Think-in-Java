//: Seventh.java
// This is the seventh exercise of chapter4

public class Seventh {
	public static void main(String[] args) {
		for(int i = 1; i < 101; i++){
			if(i == 100) break;
			System.out.print(+ i + " ");
		}
		System.out.println();
		for(int i = 1; i < 101; i++){
			if(i == 100) return;
			System.out.print(+ i + " ");
		}
	}
}
