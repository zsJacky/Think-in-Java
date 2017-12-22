// generate a Fibonacci sequence

package generics;

import net.mindview.util.*;

public class Fibonacci implements Generator<Integer>{
	private Integer count = 0;
	public Integer next() {
		return fib(count++);
	}
	private Integer fib(int n) {
		if(n < 2) return 1;
		return fib(n-2) + fib(n-1);
	}
	public static void main(String[] args) {
		Fibonacci gen = new Fibonacci();
		for(Integer i = 0; i < 308; i++) 
			System.out.print(gen.next() + " ");
	}
}