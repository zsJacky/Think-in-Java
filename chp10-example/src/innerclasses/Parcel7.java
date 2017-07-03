// returning an instance of an anonymous inner class

package innerclasses;

public class Parcel7 {
	public Contents contents() {
		//  ����һ���̳���Contents��������Ķ���
		// ���ҷŻ�����ת��ΪContents������
		return new Contents() {	  	// insert a class definition
			private int i = 11;
			public int value() {
				return i;
			}
		};	// semicolon required in this case, ���return�������������Ǳ�ʾ�ڲ������
	}
	
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
	}
}
