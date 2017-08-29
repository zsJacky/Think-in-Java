// using anonymous inner classes

package io;

import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList2 {
	public static FilenameFilter filter(final String regex) {
		// creation of anonymous inner class
		return new FilenameFilter() {
			private Pattern pattern = Pattern.compile(regex);
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		}; // end of anonymous inner class
	}
	public static void main(String[] args) {
		File path = new File("src/io");
		String[] list;
		if(args.length == 0)
			list = path.list();
		else
			list = path.list(new DirFilter(args[0]));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : list)
			System.out.println(dirItem);	
	}
}
