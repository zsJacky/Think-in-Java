package exercise;

public class Third {
	public static void main(String[] args) {
		Integer[] i = {1,2,3,4};
		try {
			System.out.println(i[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
