// sceond.java of chapter9 exercise

abstract class SecondAbstarctClass {}

public class Second {
	public static void main(String[] args) {
		// 抽象类无法实例化，在编译时报错
		new SecondAbstarctClass();
	}
}
