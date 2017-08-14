// the finally clause is always executed

package exceptions;

class ThreeException extends Exception { }

public class FinallyWorks {
	static int count = 0;
	public static void main(String[] args) {
		while (true) {
			try {
				// post-increment is zero first time
				if (count++ == 0)
					throw new ThreeException();
				System.out.println("no exception");
			} catch(ThreeException e) {
				System.out.println("ThreeException");
			} finally {
				System.out.println("in finally clause");
				if (count == 2) break;	// out of while
			}
		}
	}

}
