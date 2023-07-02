package arrays;

import java.util.Scanner;

public class ArrayInputs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array");
        int n = sc.nextInt();

        int[] array1 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " position number..");
            array1[i] = sc.nextInt();
        }
        System.out.println("Your array is ....");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "   ");
        }
    }
}
