//: Sixth.java
// This is the sixth exercise of chapter2.
import java.util.*;

class StorageTest {
	int storage(String s) {
		return s.length() * 2;
	}
}

public class Sixth {
	public static void main(String[] args) {
		StorageTest sl = new StorageTest();
		System.out.println("Hello!���ֽ�����: " + sl.storage("Hello!"));
		System.out.println("World!���ֽ�����: " + sl.storage("World!"));
		System.out.println("Hello! World!���ֽ�����: " + sl.storage("Hello! World!"));		
	}
}
