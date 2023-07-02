package arrays;

public class Array1 {


    public static void main(String[] args) {

        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[6]; //initialize


        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;

        int[] secondArray = {13, 56, 23, 89, 90, 78, 67};

        String[] names = {"Sagar", "Aditya", "Dipankar", "Riya", "Sumana", "Anil" };

        int len = names.length;

      //  String s = "ABCD";

       // int len2  = s.length();

       // System.out.println(names[0]);

        for(int i=0; i<names.length ; i++){
            System.out.println(names[i]);
        }

       /* for (int i = 0; i < 7; i++) {
            System.out.println(secondArray[i]);
        }

        int i = 0;
        while (i < 7) {
            System.out.println(secondArray[i]);
            i++;
        }*/


    }


}
