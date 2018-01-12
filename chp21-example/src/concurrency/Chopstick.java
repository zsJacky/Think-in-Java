// Chopsticks for dining philosophers

package concurrency;

public class Chopstick {
	private boolean taken = false;
	public synchronized void take() throws InterruptedException {
		while(taken)	// 两个哲学家不能同时拿同一个筷子，如果某个哲学家的左边或右边的筷子已经被使用了，则等待别人调用drop()方法释放筷子
			wait();
		taken = true;
	}
	public synchronized void drop() {
		taken = false;
		notifyAll();
	}
}
