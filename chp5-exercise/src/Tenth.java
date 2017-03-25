//: Tenth.java
// This is the tenth exercise of the chapter5.

public class Tenth {
	private String name;
	Tenth(String name) {
		this.name = name;
		System.out.println(name + " has been initialized");
	}
	
	protected void finalize() {
		System.out.println(name + " has been recycled");
	}
	public static void main(String[] args) {
		Tenth obj1=new Tenth("∂‘œÛ“ª");
	}
}
