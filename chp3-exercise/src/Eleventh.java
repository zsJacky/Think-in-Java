//: Eleventh.java
// This is the eleventh exercise of chapter3

public class Eleventh {
	public static void main(String[] args) {
		int h = 0x10000000;  
        System.out.println(Integer.toBinaryString(h));  
        for(int i = 0; i < 28; i++) {  
            h >>>= 1;  
            System.out.println(Integer.toBinaryString(h));  
        } 
	}
}
