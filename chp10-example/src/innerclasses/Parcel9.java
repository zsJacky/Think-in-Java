// a anonymous inner class that performs
// initialization. a briefer version of Parcle5.java

package innerclasses;

public class Parcel9 {
	// argument must be final to use inside
	// anonymous inner class
	public Destination destination(String dest) {
		return new Destination() {
			private String label = dest;
			public String readLabel() {
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
	}
}
