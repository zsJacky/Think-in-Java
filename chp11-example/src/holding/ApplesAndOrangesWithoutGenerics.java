// simple container example (produces compiler warning)

package holding;

import java.util.*;

import sun.applet.Main;

class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() {
		return id;
	}
}

class Orange{}

public class ApplesAndOrangesWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for (int i = 0; i < 3; i++) 
			apples.add(new Apple());
		// not prevented from adding an Orange to apples
		apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++)
			// Orange is detected only at run time
			((Apple)apples.get(i)).id();
		
	}



}










