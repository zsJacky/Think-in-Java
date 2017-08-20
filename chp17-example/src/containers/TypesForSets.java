// method necessary to put your own type in a Set

package containers;

import java.util.*;

class SetType {
	int i;
	public SetType(int n) { i = n; }
	public boolean equals(Object o) {
		return o instanceof SetType && (i == ((SetType)o).i);
	}
	public String toString() {
		return Integer.toString(i);
	}
}

class HashType extends SetType {
	public HashType(int i) {
		super(i);
	}
	public int hashCode() {
		return i;
	}
}

class TreeType extends SetType implements Comparable<TreeType> {
	public TreeType(int n) {
		super(n);
	}
	public int compareTo(TreeType arg) {
		return (arg.i < i ? -1 : (arg.i == i ? 0 : 1));
	}
}


public class TypesForSets {

}
