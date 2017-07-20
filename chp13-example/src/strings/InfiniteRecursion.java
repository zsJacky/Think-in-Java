// accidental recursion
// {RunByHand}

package strings;

import java.util.*;

public class InfiniteRecursion {
	public String toString() {
		return " InfiniteRecursion address: " + this.toString() + "\n";
		// second.java
//		return super.toString();
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++)
			v.add(new InfiniteRecursion());
		System.out.println(v);
	}
}
