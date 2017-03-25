//: Fourteenth.java
// This is the fourteenth exercise of the chapter5.

class Movies {
	static String mov1 = new String("hello mov1");
	static String mov2;
	static {
		mov2 = new String("hello mvo2");
	}
	Movies() {
		System.out.println("Movies()");
	}
	
	static void movieInfo() {
		System.out.println(mov1);
		System.out.println(mov2);
	}
}

public class Fourteenth {
	public static void main(String[] args) {
		new Movies().movieInfo();;
	}
}
