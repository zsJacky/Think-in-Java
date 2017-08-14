// guaranteeing proper cleanup of a resource

package exceptions;

public class Cleanup {
	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("Cleanup.java");
			try {
				String s;
				String s2;
				int i = 1;
				while((s=in.getLine()) != null)
					  s2 = "hi";
					// perform line-by-line processing here
			} catch(Exception e) {
				System.out.println("Caught exception in main");
				e.printStackTrace(System.out);
			} finally {
				in.dispose();
			}
		}catch(Exception e) {
			System.out.println("InputFile constrcution failed");
		}
	}
}
