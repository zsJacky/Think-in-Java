// returning an instance of an anonymous inner class

package innerclasses;

public class Parcel7 {
	public Contents contents() {
		//  创建一个继承自Contents的匿名类的对象
		// 并且放回向上转型为Contents的引用
		return new Contents() {	  	// insert a class definition
			private int i = 11;
			public int value() {
				return i;
			}
		};	// semicolon required in this case, 表达return语句结束，并不是表示内部类结束
	}
	
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
	}
}
