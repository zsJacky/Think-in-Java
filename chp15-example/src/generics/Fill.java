// generalizing the FilledList idea

package generics;

import java.util.*;

import com.sun.javafx.animation.TickCalculation;


// Doesn't work with "anything that has an add()", There is
// no "Addable" interface so we are narrowed to using a
// Collection. We cannot generalize using generics in this case

public class Fill {
	public static <T> void fill(Collection<T> collection, Class<? extends T> classToken, int size) {
		for(int i = 0; i < size; i++)
			// assume default constructor
			try {
				collection.add(classToken.newInstance());
			} catch(Exception e) {
				throw new RuntimeException(e);
			}
	}
}

class Contract {
	private static long counter = 0;
	private final long id = counter++;
	public String toString() {
		return getClass().getName() + " " + id;
	}
}

class TitleTransfer extends Contract {}

class FillTest {
	public static void main(String[] args) {
		List<Contract> contracts = new ArrayList<Contract>();
		Fill.fill(contracts, Contract.class, 3);
		Fill.fill(contracts, TitleTransfer.class, 2);
		for(Contract c : contracts)
			System.out.println(c);
		SimpleQueue<Contract> contractQueue = 
			new SimpleQueue<Contract>();
		// wno't work. fill() is not generic enough
		Fill.fill(contractQueue, Contract.class, 3);
	}
}
