package arrays;

public class SearchNumber {

    public static void main(String[] args) {

        int[] array1 = {1, 45, 34, 23, 65, 89, 90};

        int num = 90;

        int result = 0;

        int pos = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == num) {
                result = 1;
                pos = i;
                break;
            }
        }

        if (result == 0) {
            System.out.println("Number not found");
        } else
            System.out.println("Number found at position:" + (pos+1));
    }
}
