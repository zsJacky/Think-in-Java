// using explicit Lock objects to create critical sections

package concurrency;

import java.util.concurrent.locks.*;

// synchronize the entire method
class ExplicitPairManager1 extends PairManager {
	private Lock lock = new ReentrantLock();
	public synchronized void increment() {
		lock.lock();
		try {
			p.incrementX();
			p.incrementY();
			store(getPair());
		} finally {
			lock.unlock();
		}
	}

}

// use a critical section
class ExplicitPairManager2 extends PairManager {
	private Lock lock = new ReentrantLock();
	public synchronized void increment() {
		Pair temp;
		lock.lock();
		try {
			p.incrementX();
			p.incrementY();
			temp = getPair();
		} finally {
			lock.unlock();
		}
		store(temp);
	}
}

public class ExplicitCriticalSection {
	public static void main(String[] args) {
		PairManager pman1 = new ExplicitPairManager1(),
				pman2 = new ExplicitPairManager2();
		CriticalSection.testApproaches(pman1, pman2);
	}
}
