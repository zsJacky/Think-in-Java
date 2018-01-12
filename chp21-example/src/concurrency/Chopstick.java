// Chopsticks for dining philosophers

package concurrency;

public class Chopstick {
	private boolean taken = false;
	public synchronized void take() throws InterruptedException {
		while(taken)	// ������ѧ�Ҳ���ͬʱ��ͬһ�����ӣ����ĳ����ѧ�ҵ���߻��ұߵĿ����Ѿ���ʹ���ˣ���ȴ����˵���drop()�����ͷſ���
			wait();
		taken = true;
	}
	public synchronized void drop() {
		taken = false;
		notifyAll();
	}
}
