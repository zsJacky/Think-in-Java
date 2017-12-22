package generics;

import java.util.*;

public class ByteSet {
	public static void main(String[] args) {
		Byte[] possibles = {1,2,3,4,5,6,7,8,9};
		Set<Byte> set =
			new HashSet<Byte>(Arrays.asList(possibles));
		// but you can't do this
		Set<Byte> mySet2 = new HashSet<Byte>(
			Arrays.<Byte>asList(1,2,3,4,5,6,7,8,9));
	}
}
