package misc;

import static java.lang.Math.*;

public class Math_pow {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        //arr[i] = arr[i] * arr[i];
        arr[i]= (int) pow(arr[i],2);
      }
      System.out.println(arr[i]);
    }

  }
}




