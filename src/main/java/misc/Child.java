package misc;
public class Child extends Parent {

	int a =2;
	
	public static void main(String[] args) {
		
		Parent obj = new Child();
		System.out.println(obj.a);
		obj.print();
		
	}
	
	void print(){
		System.out.println(a);
	}
}
