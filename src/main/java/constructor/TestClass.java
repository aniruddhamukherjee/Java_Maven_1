package constructor;

public class TestClass {
  String name;
  public TestClass(String name){
    this.name = name;
  }


  public static void main(String[] args) {
    TestClass obj = new TestClass("Anil");

    System.out.println(obj.name);
  }
}
