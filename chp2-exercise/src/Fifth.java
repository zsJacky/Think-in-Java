//: Fifth.java
// This is the fifth exercise of chapter2.

class DataOnly2{
	int i;
	double d;
	boolean b;
	
	void show(){
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
		}
}

public class Fifth {
	public static void main(String[] args){
	DataOnly2 data = new DataOnly2();
	data.i = 47;
	data.d = 1.1;
	data.b = false;
	data.show();
	}
}
