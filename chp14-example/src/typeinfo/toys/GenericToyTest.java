// testing class Class

package typeinfo.toys;

public class GenericToyTest {
	public static void main(String[] args) throws Exception{
		Class<FancyToy> ftClass = FancyToy.class;
		// produce exact type
		FancyToy fancyToy = ftClass.newInstance();
		Class<? super FancyToy> up = ftClass.getSuperclass();	//创建FancyToy超类的实例
		// this won't compile
		//ftClass是FancyToy的Class对象的引用，不能创建Toy类的引用
		Class<Toy> up2 = ftClass.newInstance();
		// only produces Object
		Object obj = up.newInstance();
	}
}
