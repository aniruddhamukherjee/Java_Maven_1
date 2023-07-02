package array_assignments;

/* Assume there is an array of 10 integers : [34, 82, 49, 19, 45, 60, 59, 24, 81, 38]

    Find the index of the number : 82 and 9.

    Output:
    82 is found at index 1
    9 is not found */

public class SearchNumberIndex {

    public static void main(String[] args) {

        int[] array1 = {34, 82, 49, 19, 45, 60, 59, 24, 81, 38};

        int num1 = 82;
        int num2 = 9;

        int resultNum1 = 0;
        int resultNum2 = 0;


        int indexOfNum1 = 0;
        int indexOfNum2 = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == num1) {
                indexOfNum1 = i;
                resultNum1 = 1;
                break;
            }

        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == num2) {
                indexOfNum2 = i;
                resultNum2 = 1;
                break;
            }
        }

        //num 1 results
        if (resultNum1 == 0) {
            System.out.println(num1 + " not found ");
        } else {
            System.out.print(num1 + " is found" + " at index " + indexOfNum1);
        }
        System.out.println();
        //num2 results
        if (resultNum2 == 0) {
            System.out.println(num2 + " not found ");
        } else {
            System.out.print(num2 + " is found" + " at index " + indexOfNum2);
        }

    }
}
