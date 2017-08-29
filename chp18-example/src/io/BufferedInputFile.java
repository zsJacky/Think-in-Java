package io;

import java.io.*;

public class BufferedInputFile {
	// throw exception to console
	public static String read(String filename) throws IOException {
		// reading input by lines
		BufferedReader in = new BufferedReader(
				new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		while((s=in.readLine())!=null)
			sb.append(s + "\n");
		in.close();
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(read("src/io/BufferedInputFile.java"));
	}
}
