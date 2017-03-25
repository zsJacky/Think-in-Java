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
		System.out.println("Hello!的字节数是: " + sl.storage("Hello!"));
		System.out.println("World!的字节数是: " + sl.storage("World!"));
		System.out.println("Hello! World!的字节数是: " + sl.storage("Hello! World!"));		
	}
}
