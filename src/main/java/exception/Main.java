package exception;

public class Main {


    public static void main(String[] args) {
        try {
            Code1.calc();
        }
        catch (CustomException e) {System.out.println(e.errorMsg);
       }

    }
}
