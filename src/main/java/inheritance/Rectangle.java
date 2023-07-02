package inheritance;

public class Rectangle {
   static Operation op; //HAS-A

    static int calArea(int x, int y){
        op = new Operation();
        int area = op.calMultiply(x,y);
        return area;
    }
    public static void main(String[] args) {
        int len=5, width=7;
        System.out.println("Area of the rectangle is :" + calArea(len, width));
    }
}
