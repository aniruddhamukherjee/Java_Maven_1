package arrays;

import java.util.Scanner;
public class twoDarr
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m,n,i,j;
        System.out.println("enter the number of rows");
        m= sc.nextInt();
        System.out.println("enter the number of columns");
        n= sc.nextInt();
        int array[][]= new int[m][n];
        System.out.println("Enter the elements of the array: ");
        for(i=0; i<m; i++){
            for(j=0; j<array[i].length; j++){
                System.out.println("Enter row "+i+" and column "+j+" number");
                array[i][j]= sc.nextInt();
            }
        }
        System.out.println("Elements of the array are: ");
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++){
                System.out.print(array[i][j] + " "); }
            System.out.println();

        }

        for( i = 0; i < array.length; i++){

            int max=array[i][0];
            for(j = 0; j < array[i].length; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                }

            }
            System.out.println("The max element is "+max);
        }

    }
}