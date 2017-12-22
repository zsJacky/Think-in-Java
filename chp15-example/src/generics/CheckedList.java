// using Collection.checkedList()

package generics;

import typeinfo.pets.*;
import java.util.*;

public class CheckedList {
	@SuppressWarnings("unchecked")
	static void oldStyleMethod(List probablyDogs) {
		probablyDogs.add(new Cat());
	}
	public static void main(String[] args) {
		List<Dog> dogs1 = new ArrayList<Dog>();
		oldStyleMethod(dogs1);// quietly accepts a Cat
		List<Dog> dogs2 = Collections.checkedList(
			new ArrayList<Dog>(), Dog.class);
		try {
			oldStyleMethod(dogs2); 	// throws an exception
		} catch(Exception e) {
			System.out.println(e);
		}
		// derived types work fine
		List<Pet> pets = Collections.checkedList(
			new ArrayList<Pet>(), Pet.class);
		pets.add(new Dog());
		pets.add(new Cat());
	}
}
