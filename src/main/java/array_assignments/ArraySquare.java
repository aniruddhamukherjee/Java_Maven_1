package array_assignments;

import java.util.Scanner;

/*Write a Java program to create an array of 5 integer(“int” data type) numbers by taking input from the console. Print the square of all numbers in the array.

    Ex:
    Input :  [3, 5, 4, 1, 2]
    Output : [9, 25, 16, 1, 4] */

public class ArraySquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();

        int[] array1 = new int[n];

        System.out.println("enter the items");

        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
    }
}
