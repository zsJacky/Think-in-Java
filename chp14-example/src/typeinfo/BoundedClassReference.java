package typeinfo;

public class BoundedClassReference {
	public static void main(String[] args) {
		Class<? extends Number> bounded = int.class;	// 可以接受任何继承自Number的类型
		bounded = double.class;
		bounded = double.class;
		// or anything else derived from Number
	}
}
