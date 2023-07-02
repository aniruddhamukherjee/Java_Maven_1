package arrays;

public class TwoDArrayTraverse {
    public static void main(String[] args) {

        int[][] myNumbers = {
                             {1, 2, 3, 4, 88, 99},       //i=0
                             {5, 6, 7},                  //i=1
                             {11, 12, 13, 14, 15, 16}   //i=2
                           };

        //System.out.println("Number of rows , i.e, array length = " + myNumbers.length);

        //System.out.println("Number of items in first row = " + myNumbers[0].length);

        for (int i = 0; i < myNumbers.length; i++) {  // number of rows
            for (int j = 0; j < myNumbers[i].length; j++) {  //number of columns in each row
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
