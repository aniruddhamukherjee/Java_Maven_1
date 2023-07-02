package collection;

public class WrapperClassTest {
  private int x = 5;
  static Integer y;
  static double d = 3.6789;

  static float ff = 3.56F;

  public static void main(String[] args) {
    WrapperClassTest obj = new WrapperClassTest();

    obj.x = 5;

    Integer a = null;

    Integer y = obj.x;  //autoboxing

    int b = a;  //unboxing

    Double dd = d;

    Float ff1 = ff;


    System.out.println(obj.x);

    System.out.print(b);



  }


}
