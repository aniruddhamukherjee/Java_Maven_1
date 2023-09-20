package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionCustomException3 {

  public static void main(String[] args) {
    try {
      readFile();
    } catch (CustomException1 e) {
      System.out.println(e.getErrorMessage());
    }

    System.out.println("Rest of the code in void main.........");
  }

  public static void readFile() throws CustomException1 {
    FileInputStream fis = null;

    try {
      fis = new FileInputStream(
          "C:\\Users\\animukhe8\\OneDrive - Publicis Groupe\\Desktop\\testfile.txt");
      int data;
      System.out.println("Reading file content..... \n ");
      while ((data = fis.read()) != -1) {   //error here
        // Process the data
        System.out.print((char) data);
      }
      System.out.println();
      int x = 10/0;

    } catch (IOException ex) {
      throw new CustomException1("Error occurred while reading file, please try again!!");
    }
    catch (ArithmeticException ex) { // not recommended, only for showing logic used here
      throw new CustomException1("Error occurred in mathematical operation");
    }

    System.out.println("Rest of the code in readfile method.....");
  }
}
