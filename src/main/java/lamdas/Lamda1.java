package lamdas;

@FunctionalInterface  //It is optional
interface Drawable2 {
    public void draw(int width);

    static void draw2(){
        System.out.println("hello world 1");
    }

     static void draw3(){
        System.out.println("hello world 2");
    }

     static void draw4(){
        System.out.println("hello world 3");
    }
}

public class Lamda1 {
    public static void main(String[] args) {

        int width = 10;

        Drawable2 d2 = (int w) -> {
            System.out.println("Drawing " + width);
        };

        Drawable2 d3 = (int w) -> {
            System.out.println("Printing " + width);
        };


        d2.draw(10);

        d3.draw(10);
    }
}