package misc;

import java.util.Scanner;

public class InputSamples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name..");
        String name = scanner.nextLine();

        System.out.println("Enter your age..");
        int age = scanner.nextInt();

        System.out.println("Enter your employee id..");
        long empId = scanner.nextLong();

        System.out.println("My name is " + name);


    }
}
