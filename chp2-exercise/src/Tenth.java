//: Tenth.java
// This is the tenth exercise of chapter 2.

public class Tenth {
	public static void main(String args[]) {
		if(args.length==0)
			System.out.println("No command line arguments");
		else {
			System.out.println("Command line arguments were: ");
			for(int i=0;i<args.length;i++)    //ѭ�����������������յ��Ĳ���
				System.out.println("Argument"+(i+1)+":"+args[i]);
		}
	}
}

