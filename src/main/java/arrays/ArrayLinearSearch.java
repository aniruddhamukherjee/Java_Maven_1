package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLinearSearch {

    // Java program to check whether
// an element is present in array or not


    // Function return true if given element
    // found in array
    private static boolean check(int[] arrrrrrr, int toCheckValue) {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        boolean test = false;
        for (int element : arrrrrrr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }

        // Print the result
       /* System.out.println("Is " + toCheckValue
                + " present in the array: " + test);*/
        return test;
    }

    public static void main(String[] args) {

        // Get the array
        int arr[] = {5, 1, 1, 9, 7, 2, 6, 10};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int n = sc.nextInt();

        // Print the array
        //System.out.println("Array: "
              //  + Arrays.toString(arr));

        // Check if this value is
        // present in the array or not
        boolean result = check(arr, n);
        System.out.println("Is " + n
                + " present in the array: " + result);
    }
}


