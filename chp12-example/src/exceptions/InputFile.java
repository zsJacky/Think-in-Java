// paying attention to exceptions in 

package exceptions;

import java.io.*;

import com.sun.java_cup.internal.runtime.Symbol;

public class InputFile {
	private BufferedReader in;
	public InputFile(String fname) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fname));
			// other code that might throw exceptions
		} catch(FileNotFoundException e) {
			System.out.println("Could not open " + fname);
			// wasn't open, so don't close it
			throw e;
		} catch(Exception e) {
			// all other exceptions must close it
			try {
				in.close();
			} catch(IOException e2) {
				System.out.println("in.close() unsuccessful");
			}
			throw e;	// rethrow
		} finally {
			// don't close it here
		}
	}
	public String getLine() {
		String s;
		try {
			s = in.readLine();
		} catch(IOException e) {
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}
	public void dispose() {
		try {
			in.close();
			System.out.println("dispose() successful");
		} catch(IOException e) {
			throw new RuntimeException("in.close() failes");
		}
	}
}
