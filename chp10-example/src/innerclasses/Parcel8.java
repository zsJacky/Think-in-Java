// calling the base-class contructor

package innerclasses;

public class Parcel8 {
	public Wrapping wrapping(int x) {
		// base constructor
		return new Wrapping(x) { // pass constructor argument
			public int value() {
				return super.value() * 47;
			}
		};
	}
	public static void main(String[] args) {
		Parcel8 p = new Parcel8();
		Wrapping w = p.wrapping(10);
		System.out.println(w.value());
	}
}
