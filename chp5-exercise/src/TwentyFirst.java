//: TwentyFirst.java
// This is the twenty-first exercise of the chapter5.

public class TwentyFirst {
	public static void main(String[] args) {
		for(Dollars d : Dollars.values())
			System.out.println(d + ", ordinal " + d.ordinal());
	}
}
