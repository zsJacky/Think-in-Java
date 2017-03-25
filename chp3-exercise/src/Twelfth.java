public class Twelfth {
	public static void main(String[] args) {
		int h=0xffffffff;  
        for(int i = 0; i < 3; i++) {  
            h <<= 1;  
            System.out.println(Integer.toBinaryString(h));  
        }  
        System.out.println("-------------end2--------------------");  
        for(int i = 0; i < 28; i++) {  
            h >>>= 1;  
            System.out.println(Integer.toBinaryString(h)); 
        }
	}
}
