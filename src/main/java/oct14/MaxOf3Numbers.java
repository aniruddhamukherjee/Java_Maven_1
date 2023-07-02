package oct14;

import java.util.Scanner;

public class MaxOf3Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a");
        int a = scanner.nextInt();

        System.out.println("Enter b");
        int b = scanner.nextInt();

        System.out.println("Enter c");
        int c = scanner.nextInt();

        int max;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }


        System.out.println("Max nunmer is : " + max);
    }


}
