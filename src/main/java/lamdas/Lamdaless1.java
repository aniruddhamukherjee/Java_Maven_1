package lamdas;

interface Drawable {
    public void draw(int width);
}

class DrawableImpl implements  Drawable{

    @Override
    public void draw(int width) {
        System.out.println("Drawing " + width);
    }
}



public class Lamdaless1 {
    public static void main(String[] args) {

        int width = 10;

        DrawableImpl obj = new DrawableImpl();

        obj.draw(10);
    }
}