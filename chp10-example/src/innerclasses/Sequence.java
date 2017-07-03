// hold a sequence of objects
// Second.java of chapter 10

package innerclasses;

interface Selector {
	boolean end();
	Object current();
	void next();
}

// exercise
class Second {
	public String sec = "Second";
	public String toString() {
		return sec;
	}
}

public class Sequence {
	private static String outer = "OuterClass";
	private Object[] items;
	private int next = 0;
	public Sequence(int size) {
		items = new Object[size];
	}
	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() {
			return i == items.length;
		}
		public Object current() {
			return items[i];
		}
		public void next() {
			if (i < items.length)
				i++;
		}
		// exercise fourth of chapter 10
		public Sequence refOuter() {
			return Sequence.this;
		}
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++) 
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		
		// exercise second of chapter10
		System.out.println();
		Sequence sequence2 = new Sequence(5);
		for (int i = 0; i < 5; i++) 
			sequence2.add(new Second());
		Selector selector2 = sequence2.selector();
		while (!selector2.end()) {
			System.out.print(selector2.current() + " ");
			selector2.next();
		}

		// exercise fourth of chater10
		System.out.println();
		Sequence.SequenceSelector ss = sequence2.new SequenceSelector();
		System.out.println(ss.refOuter().outer);
	}
}







