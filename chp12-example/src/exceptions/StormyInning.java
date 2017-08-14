// overridden methods may throw only the exceptions specified
// in their base-class versions, or exceptions derived from the
// base-class exceptions.

package exceptions;

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
	public Inning() throws BaseballException {}
	public void event() throws BaseballException {
		// doesn't actually have to throw anything
	}
	public abstract void atBat() throws Strike, Foul;
	public void walk() {}	// throws no checked exceptions
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
	// ok to add new exceptions for constructrs, but you
	// must deal with the base constructor exceptions;
	public StormyInning() throws RainedOut, BaseballException {}
	public StormyInning(String s) throws RainedOut, BaseballException {}
	// regular methods must conform to base class
//	public void walk() throws PopFoul {}	// compile error
	//interface cannot add exceptions to existing methods from the base class
//	public void event() throws RainedOut {}
	// if the mehtod doesn't already exise in the 
	// base class, the exception is ok:
	public void rainHard() throws RainedOut {}
	// you can choose to not throw any exceptions
	// even if the base version does
	public void event() {}
	// overridde methods can throws inherited exceptions:
	public void atBat() throws PopFoul {}	
	
	public static void main(String[] args) {
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch(PopFoul e) {
			System.out.println("Pop foul");
		} catch(RainedOut e) {
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		// strike not thrown in derived version
		try {
			// what happen if you upcast
			Inning i = new StormyInning();
			i.atBat();
			// you must catch the exceptions from 
			// the base-class version of the mehtod
		} catch(Strike e) {
			System.out.println("Strike");
		} catch(Foul e) {
			System.out.println("Foul");
		} catch(RainedOut e){
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}
}






