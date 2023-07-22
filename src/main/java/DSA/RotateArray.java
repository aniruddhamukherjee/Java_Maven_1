package DSA;

import java.util.Arrays;

public class RotateArray {


    /*
    Problem: Rotate an array of n elements to the right by k steps. For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

    Can we do this in O(1) space and in O(n) time? The following solution does. Assuming we are given 1,2,3,4,5,6,7 and order 3. The basic idea is:
        1. Divide the array two parts: 1,2,3,4 and 5,6,7
        2. Rotate first part: 4,3,2,1, 5,6,7
        3. Rotate second part: 4,3,2,1, 7,6,5
        4. Rotate the whole array: 5,6,7,1,2,3,4


     */

    public static void rotate(int[] arr, int order) {
        order = order % arr.length;
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        //length of first part
        int a = arr.length - order;
        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1)
            return;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }

}