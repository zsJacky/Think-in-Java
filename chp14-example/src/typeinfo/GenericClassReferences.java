package typeinfo;

public class GenericClassReferences {
	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;	// same thing
//		genericIntClass = doubles.class;
		
	}
}
