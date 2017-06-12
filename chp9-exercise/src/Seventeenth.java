// Seventeenth.java of chapter9 exercise

interface X {
	int x = 5;
	void print();
}

public class Seventeenth implements X{
	public void print() {}
	public static void main(String[] args) {
//		Seventeenth.x = 10;	// final变量不可修改
		System.out.println(Seventeenth.x);	// static变量可以通过类来访问
	}
	
}
