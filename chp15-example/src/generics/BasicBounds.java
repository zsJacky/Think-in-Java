package generics;

interface HasColor {
	java.awt.Color getColor();
}

class Colored<T extends HasColor> {
	T item;
	Colored(T item) {
		this.item = item;
	}
	T getItem() {
		return item;
	}
	// the bound allows you to call a method
	java.awt.Color color() {
		return item.getColor();
	}
}

class Dimension {
	public int x, y, z;
}

// this won't work -- class muse be first, then interface
//class ColoredDimenssion<T extends HasColor & Dimension> {}

// multiple bounds
class ColoredDimension<T extends Dimension & HasColor> {
	T item;
	ColoredDimension(T item) {
		this.item = item;
	}
	T getItem() {
		return item;
	}
	java.awt.Color color() {
		return item.getColor();
	}
	int getX() {
		return item.x;
	}
	int getY() {
		return item.y;
	}
	int getZ() {
		return item.z;
	}
}

interface Weight {
	int weight();
}

// as with inheritance, you can have only one
// concrete class but multiple interfaces:
class Solid<T extends Dimension & HasColor & Weight> {
	T item;
	Solid(T item) {
		this.item = item;
	}
	T getItem() {
		return item;
	}
	java.awt.Color color() {
		return item.getColor();
	}
	int getX() {
		return item.x;
	}
	int getY() {
		return item.y;
	}
	int getZ() {
		return item.z;
	}
	int weight() {
		return item.weight();
	}
}

class Bounded extends Dimension implements HasColor, Weight {
	public java.awt.Color getColor() {
		return null;
	}
	public int weight() {
		return 0;
	}
}

public class BasicBounds {
	public static void main(String[] args) {
		Solid<Bounded> solid = 
			new Solid<Bounded>(new Bounded());
		solid.color();
		solid.getY();
		solid.weight();
	}
}
