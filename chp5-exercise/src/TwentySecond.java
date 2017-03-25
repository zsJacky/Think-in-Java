//: Burrito.java

public class TwentySecond {
	Dollars dollar;
	public TwentySecond(Dollars dol) { this.dollar = dol;}
	public void decribe() {
		switch(dollar) {
			case ONE:	System.out.println("一元");
						break;
			case FIVE:	System.out.println("五元");
						break;
			case TEN:	System.out.println("十元");
						break;
			case TWENTY: System.out.println("二十元");
						break;
			case FIFTY: System.out.println("五十元");
						break;
			case HUNDRED: System.out.println("一百元");
						break;			
		}
	}
	public static void main(String[] args) {
		TwentySecond
			one = new TwentySecond(Dollars.ONE),
			five = new TwentySecond(Dollars.FIVE),
			ten= new TwentySecond(Dollars.TEN),
			twenty= new TwentySecond(Dollars.TWENTY),
			fifty= new TwentySecond(Dollars.FIFTY),
			hundred = new TwentySecond(Dollars.HUNDRED);
			
		one.decribe();
		five.decribe();
		ten.decribe();
		twenty.decribe();
		fifty.decribe();
		hundred.decribe();
	}
}
