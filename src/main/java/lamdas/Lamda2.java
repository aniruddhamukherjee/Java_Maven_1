package lamdas;

interface Sayable1{
    public String say();
}
public class Lamda2{
    public static void main(String[] args) {
        Sayable1 s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}