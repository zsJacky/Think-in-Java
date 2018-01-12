// using the Semaphore inside a Pool, to restrict
// the number of tasks that can use a resource

package concurrency;

import java.util.*;
import java.util.concurrent.*;

public class Pool<T> {
	private int size;
	private List<T> items = new ArrayList<T>();	// object pool
	private volatile boolean[] checkOut;
	private Semaphore available;
	public Pool(Class<T> classObject, int size) {
		this.size = size;
		checkOut = new boolean[size];
		available = new Semaphore(size, true);
		// load pool with objects that can be checked out
		for(int i = 0; i < size; i++) 
			try {
				// assumes a default constructor
				items.add(classObject.newInstance());
			} catch(Exception e) {
				throw new RuntimeException(e);
			}
	}
	public T checkOut() throws InterruptedException {
		available.acquire();
		return getItem();
	}
	public void checkIn(T x) {
		if(releaseItem(x))
			available.release();
	}
	private synchronized T getItem() {
		for(int i = 0; i < size; ++i)
			if(!checkOut[i]) {
				checkOut[i] = true;
				return items.get(i);
			}
		return null;	// Semaphore prevents reaching here
	}
	private synchronized boolean releaseItem(T item) {
		int index = items.indexOf(item);
		if(index == -1) return false;	// not in the list
		if(checkOut[index]) {
			checkOut[index] = false;
			return true;
		}
		return false;	// wasn't checked out
	}
}
