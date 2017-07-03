package exercise;

public class Seventh {
	private int i = 7;
	private int getValue() {
		return i;
	}
	public class InnerClass {
		public void setOuterValue(int value) {
			Seventh.this.i = value;
		}
	}
	public InnerClass inner() {
		return new InnerClass();
	}
}
