package exercise;

import java.io.*;
import java.util.*;


class ReverseArrayList<T> extends ArrayList<T> {
	public ReverseArrayList(Collection<T> c) { super(c); }
	public Iterable<T> reverse() {
		return new Iterable<T>() {
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					int current = size() - 1;
					public boolean hasNext() {
						return current > -1;
					}
					public T next() {
						return get(current--);
					}
				};
			}
		};
	}
}


public class Seventh {
	// throw exception to console
	public static String read(String filename) throws IOException {
		// reading input bu lines
		BufferedReader in = new BufferedReader(
				new FileReader(filename));
		String s;
		List strList = new ArrayList();
		while((s=in.readLine())!=null)
			// Nineth.java 所有行转换成大写输出
//			strList.add(s.toUpperCase() + "\n");
			// Teth.java 从命令行接收参数，输出文件中包含要查找的单词的文本行
//			if (s.contains(args[2]))
//				strList.add(s + "\n");
		in.close();
		
		StringBuilder sb = new StringBuilder();
		ReverseArrayList<String> reverStr = new ReverseArrayList(strList);
		for(String s2 : reverStr.reverse())
			sb.append(s2);
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(read("src/exercise/Seventh.java"));
		// Eighth.java
//		System.out.println(read(args[1]));
	}
}

