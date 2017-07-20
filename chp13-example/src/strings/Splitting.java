package strings;

import java.util.*;

public class Splitting {
	public static String knights = 
			"Then, when you have found the shrubbery, you must " +
			"cut down the mightiest tree in the forest... " +
			"with... a herring!";
	public static void split(String regex) {
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	public static void main(String[] args) {
		split(" ");	// doesn't have to contain regex chars
		split("\\W+");	// non-word charracters
		split("n\\W+");// 'n' followed by non-word characters
	}
}
