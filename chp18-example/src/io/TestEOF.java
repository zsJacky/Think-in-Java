// testing for end of file while reading a byte at a time

package io;

import java.io.*;

import javax.xml.crypto.Data;

import com.sun.openpisces.Dasher;

public class TestEOF {
	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(
			new BufferedInputStream(
				new FileInputStream("src/io/TestEOF.java")));
		while(in.available() != 0)
			System.out.print((char)in.readByte());
	}
}
