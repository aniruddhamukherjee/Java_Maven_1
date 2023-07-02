package puzzles;

public class ObjectCreations {
    
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class<?> ref= Class.forName("TestClass");
		TestClass obj=(TestClass)ref.newInstance();
		System.out.println(obj.a);
		
	}

}
