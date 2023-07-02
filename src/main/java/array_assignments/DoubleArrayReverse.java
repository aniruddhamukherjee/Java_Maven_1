package array_assignments;

import java.util.Scanner;

/* Write a Java program to create an array of ‘n’ decimal(“double” data type) numbers by taking input from the console. Take ‘n’ as input from the user. Then print all the numbers in the array in reverse order.

    Ex:
    Enter length of array
    3
    Enter 0 position number
    0.5
    Enter 1 position number
    1.56
    Enter 2 position number
    6.34

    Your array in reverse order is : 6.34  1.56  0.5 */


public class DoubleArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();

        double[] array1 = new double[n];

        System.out.println("enter the items");

        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextDouble();
        }

       /* System.out.println("your enterd items in normal order");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "  ");
        }
*/
        //////
        System.out.println("items in reverse order");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.println(array1[i] + " ");
        }


    }
}
