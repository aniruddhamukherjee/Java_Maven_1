package logical.operations;

import java.util.Scanner;

public class GenderAgeCheck {

    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter gender");
        String gender = scannerObj.nextLine();

        System.out.println("Enter age");
        int age = scannerObj.nextInt();

        if (gender.equalsIgnoreCase("M")) {
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("NOT eligible");
            }
        } else {
            if (age >= 18) {
                System.out.println("Eligible");
            } else {
                System.out.println("NOT eligible");
            }
        }

    }
}
