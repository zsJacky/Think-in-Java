// examination of the way the class loader works

package typeinfo;

class Candy {
	static {
		System.out.println("Loading Candy");
	}
}

class Gum {
	static {
		System.out.println("Loading Gum");
	}
}

class Cookie {
	static {
		System.out.println("Loading Cookie");
	}
}

public class SweetShop {
	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After create Candy");
		try {
			// 根据类名动态创建Gum类对象
			Class.forName("Gum");
		} catch (ClassNotFoundException e) {
			System.out.println("Couldn't not found Gum");
		}
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After create Cookie");
	}
}
