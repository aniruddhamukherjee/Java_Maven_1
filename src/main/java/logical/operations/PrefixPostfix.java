package logical.operations;

public class PrefixPostfix {
  public static void main(String[] args) {

    int x = 11;

   // int y = x++;

    int y = --x + x--;


    //x--  ----- 11
    //x=10
    //++x ----


    System.out.println("y=" + y);
    System.out.println("x=" + x);


  }
}
