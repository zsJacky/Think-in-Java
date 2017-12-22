package generics;

class Cat extends ComparablePet implements Comparable<Cat> {
	// error: Comparable cannot be inherited with
	// different arguments: <Cat> and <Pet>
	public int compareTo(Cat arg) { return 0; }
}

public class HijackedInterface {

}
