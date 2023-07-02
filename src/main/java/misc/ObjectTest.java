package misc;

public class ObjectTest {
  String name;
  int age;
  public static void main(String args[]) {
    ObjectTest obj1 = new ObjectTest();
    obj1.name = "Arvind";
    ObjectTest obj2 = new ObjectTest();
    obj2.age = 23;
    obj1 = obj2;     //null 23
    System.out.println(obj1.name + " " + obj1.age);
  }
}
