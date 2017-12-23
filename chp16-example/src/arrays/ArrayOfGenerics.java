// it is possible to create arrays of generics

package arrays;

import java.util.*;

public class ArrayOfGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String>[] ls;
		List[] la = new List[10];
		ls = (List<String>[]) la;	// "Unchecked"  warning
		ls[0] = new ArrayList<String>();
		// compile-time checking produces an error
		ls[1] = new ArrayList<Integer>();
		
		// the problem: List<String> is a subtype of Object
		Object[] objects = ls;	// so assignment is OK
		// compile and run without complaint
		objects[1] = new ArrayList<Integer>();
		
		// however, if your needs are straightforward it is
		// possible to create an array generics, albeit
		// with an "unchecked" warning
		List<BerylliumSphere>[] spheres =
			(List<BerylliumSphere>[])new List[10];
		for(int i = 0; i < spheres.length; i++)
			spheres[i] = new ArrayList<BerylliumSphere>();
	}
}
