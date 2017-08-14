// caught exception hierarchies

package exceptions;

import java.lang.annotation.AnnotationFormatError;

class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

public class Human {
	public static void main(String[] args) {
		// catch the exact type
		try {
			throw new Sneeze();
		} catch(Sneeze e) {
			System.out.println("caught Sneeze");
		} catch(Annoyance e) {
			System.out.println("caught Annoyance");
		}
		
		// catch the base type
		try {
			throw new Sneeze();
		} catch(Annoyance e) {
			System.out.println("caught Annoyance");
		}
	}
}
