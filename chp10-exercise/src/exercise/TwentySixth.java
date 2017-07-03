package exercise;

class WithInnerA {
	class InnerA {
		InnerA(String s) {
			System.out.println("Inner A " + s);
		}
	}
}

class WithInnerB {
	class InnerB extends WithInnerA.InnerA {
		InnerB(WithInnerA wia, String s) {
			wia.super(s);
			System.out.println("Inner B " + s);
		}
	}
}


public class TwentySixth {
	public static void main(String[] args) {
		WithInnerA wia = new WithInnerA();
		WithInnerB wib = new WithInnerB();
		WithInnerB.InnerB wiib = wib.new InnerB(wia, "Hello"); 
	}



}
