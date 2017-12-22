// automatically create a Generator, given a class
// with a default (no-arg) constructor

package net.mindview.util;

public class BasicGenerator<T> implements Generator<T>{
	private Class<T> type;
	public BasicGenerator(Class<T> type) {
		this.type = type;
	}
	public T next() {
		try {
			// assume type is a public class
			return type.newInstance();	//使用newInstance()方法需要类具有无参构造器
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	// produce a default generator given a type token
	public static <T> Generator<T> create(Class<T> type) {
		return new BasicGenerator<T>(type);
	}
	
}
