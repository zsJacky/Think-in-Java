// displaying a directory listing using regular expressions

package io;

import java.util.regex.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class DirList {
	// 格式化文件大小 exercise3
	public static String FormetFileSize(long fileS) {// 转换文件大小
		DecimalFormat df = new DecimalFormat("#.00");
		String fileSizeString = "";
		if (fileS < 1024) {
			fileSizeString = df.format((double) fileS) + "B";
		} else if (fileS < 1048576) {
			fileSizeString = df.format((double) fileS / 1024) + "K";
		} else if (fileS < 1073741824) {
			fileSizeString = df.format((double) fileS / 1048576) + "M";
		} else {
			fileSizeString = df.format((double) fileS / 1073741824) + "G";
		}
		return fileSizeString;
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File path = new File("src/io");	// To-do: 不知道为什么不能用.表示当前路径，只能硬编码一个路径
		String[] list;
		long size=0;
		if(args.length == 0)
			list = path.list();
		else
			list = path.list(new DirFilter(args[0]));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : list){
			System.out.println(dirItem);
			size += new FileInputStream("src/io/"+dirItem).available();
		}
		System.out.println("total size of selected file is " + FormetFileSize(size));
		System.out.println("DirList " + DirList.class.getClassLoader());
	}
}

class DirFilter implements FilenameFilter {
	private Pattern pattern;
	
	public DirFilter(String regex) {
		System.out.println("DirFilter " + DirFilter.class.getClassLoader());
		pattern = Pattern.compile(regex);
	}
	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}
}
