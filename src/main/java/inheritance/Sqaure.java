package inheritance;

public class Sqaure {

  static Operation obj = new Operation(); //HAS-A

  static int calArea(int x) {

    return (obj.calSquare(x));
  }

  public static void main(String[] args) {
    int side = 8;
    System.out.println("Area of the square is :" + calArea(5));
  }
}
