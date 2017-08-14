package exercise;

public class Second {
	public static void main(String[] args) {
		Integer i = null;
		try {
			i.getClass();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
