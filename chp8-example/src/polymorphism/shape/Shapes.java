package polymorphism.shape;

public class Shapes {
	private static RandomShapeGeneraor gen = new RandomShapeGeneraor();
	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		// fill up the arrray with shapes
		for (int i = 0; i < s.length; i++)
			s[i] = gen.next();
		// make polymorphic method calls
		for (Shape shape : s)
			Shape.print(shape);
	}
}
