package typeinfo;

public class Test {
	public static void main(String[] args) {
		int i = 80;
		String s = String.valueOf(i<100?90:100);
		String s2 = String.valueOf(i<100?90:100.0);
		System.out.println(s + " " + s2);
	}
}
