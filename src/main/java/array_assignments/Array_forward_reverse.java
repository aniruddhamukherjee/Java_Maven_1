package array_assignments;

public class Array_forward_reverse {

    public static void main(String[] args) {
        //double[] Array = new double[10];

        double[] array = {1.0, 1, 1.1, 1.2, 1, 0.1, 0.0, 3.8, 3.8, .9};

//		System.out.println(Array[0]);

        for (int i = 0; i < array.length; i++) {

            double val = array[i];
            System.out.println("forward" + array[i]);


        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "  " + "reverse ");
        }
    }

}


