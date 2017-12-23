// initialization & re-assignment of arrays

package arrays;

import java.util.*;

public class ArrayOptions {
	public static void main(String[] args) {
		// arrays of objects:
		BerylliumSphere[] a;	// local uninitialized variable
		BerylliumSphere[] b = new BerylliumSphere[5];
		// the references inside the array are
		// automatically initialized to null
		System.out.println("b: " + Arrays.toString(b));
		BerylliumSphere[] c = new BerylliumSphere[4];
		for (int i = 0; i < c.length; i++)
			if (c[i] == null)	// can test for null reference
				c[i] = new BerylliumSphere();
		// aggregate initialization
		BerylliumSphere[] d = {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()};
		// dynamic aggregate initialization
		a = new BerylliumSphere[] { 
			new BerylliumSphere(), new BerylliumSphere()
		};
		System.out.println("a.length = " + a.length);
		System.out.println("b.length = " + b.length);
		System.out.println("c.length = " + c.length);
		System.out.println("d.length = " + d.length);
		a = d;
		System.out.println("a.length = " + a.length);
		
		// arrays of primitives
		int[] e;	// null reference
		int[] f = new int[5];
		// the primitives inside the array are
		// automatically initialized to zero
		System.out.println("f: " + Arrays.toString(f));
		int[] g = new int[4];
		for (int i = 0; i < g.length; i++)
			g[i] = i * i;
		int[] h = {11, 47, 93};
		// compile error: variable e not initialized
//		System.out.println("e.length = " + e.length);s
		System.out.println("f.length = " + f.length);
		System.out.println("g.length = " + g.length);
		System.out.println("h.length = " + h.length);
		e = h;
		System.out.println("e.length = " + e.length);
		e = new int[]{1, 2};
		System.out.println("e.length = " + e.length);
	}
}








