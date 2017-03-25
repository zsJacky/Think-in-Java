//: Tenth.java
// This is the tenth exercise of the chapter5.

public class Eleventh {
	private String name;
	Eleventh(String name) {
		this.name = name;
		System.out.println(name + " has been initialized");
	}
	
	protected void finalize() {
		System.out.println(name + " has been recycled");
	}
	public static void main(String[] args) {
		Tenth obj=new Tenth("∂‘œÛ“ª");
		obj = null;
		System.gc();
	}
}
