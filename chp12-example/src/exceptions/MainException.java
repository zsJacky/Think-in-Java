package exceptions;

import java.io.*;

public class MainException {
	// passing all exceptions to the console
	public static void main(String[] args) throws Exception {
		// open the file
		FileInputStream file = new FileInputStream("MainException.java");
		// use the file
		// close the file
		file.close();
	}
}
