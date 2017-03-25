//: Fourth.java
// This is the fourth exercise of chapter4

public class Fourth {
	public static void main(String[] args) {
		int j;
		for (int i = 2; i <= 100; i++ ) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (j >= i-1)
				System.out.println(i);
		}
	}
}
