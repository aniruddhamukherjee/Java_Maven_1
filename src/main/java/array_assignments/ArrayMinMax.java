package array_assignments;

/* Assume there is an array of 10 integers : [34, 82, 49, 19, 45, 60, 59, 24, 81, 38]

    Write a program to find the minimum and maximum number in the array. */

public class ArrayMinMax {

    public static void main(String[] args) {

        int[] arr = { 100, 23, 22, 105, 45, 1, 2, 3, 4, 5 };

        int max = arr[0];

        int min = arr[0];

        //finding max and min
        for (int i=1; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.print("Min = " + min + "\n");
        System.out.println("Max = " + max);

    }
}
