//: Eleventh.java
// This is the eleventh exercise of the chapter7.

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute() "); }
	public void apply() { append(" apply() "); }
	public void scrub() { append(" scrub() "); }
	public String toString() { return s; }
	
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute(); x.apply(); x.scrub();
		System.out.println(x);
	}
}

class Detergent  {
	private Cleanser cleanser = new Cleanser();
	public void append(String str) { cleanser.append(str); }
	public void dilute() { cleanser.dilute(); }
	public void apply() { cleanser.apply(); }
	public String toString() { return cleanser.toString(); }
	public void scrub() { cleanser.scrub(); }
	public void foam() { append(" foam() "); }	
}


public class Eleventh {
	public static void main(String[] args) {
		Detergent s = new Detergent();
		s.apply();s.dilute();s.foam();s.scrub();
		System.out.println(s);
	}
}
