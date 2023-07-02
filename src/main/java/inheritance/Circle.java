package inheritance;

public class Circle {
    inheritance.Operation op;//aggregation declare HAS-A
    double pi = 3.14;

    double area(int radius) {  //area of a circle = pi*r_square
        op = new inheritance.Operation(); //initialize
        int rsquare = op.calSquare(radius);//code reusability (i.e. delegates the method call).
        return pi * rsquare;
    }


    public static void main(String args[]) {
        Circle c = new Circle();
        double area = c.area(5);
        System.out.println(area);
    }
}