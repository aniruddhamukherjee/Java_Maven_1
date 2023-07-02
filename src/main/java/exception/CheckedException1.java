package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException1 {

  public static void main(String[] args) {
    try {
      FileInputStream fis
          = new FileInputStream(
          "C:\\Users\\animukhe8\\OneDrive - Publicis Groupe\\Desktop\\testfile.txt");
      int data;
      while ((data = fis.read()) != -1) {
        // Process the data
        System.out.print((char) data);
      }

      /////////
      String input = "abcd";
      if(isNumeric(input)) {
        int a = Integer.parseInt(input); //unchecked exception
      }
      else{
        System.out.println("Not a number!!!!");
      }

    } catch (FileNotFoundException ex){
      System.out.println("*** Error while finding file   **");
    }
    catch(IOException ex2){
      System.out.println("*** Error while reading file  **");
    }
    //catch(Exception ee){
    //  System.out.println("Generic exception happened");
    // }

  }

  public static boolean isNumeric(String str) {
    try {
      // Try parsing the string as an integer
      Integer.parseInt(str);
      return true;
    } catch (NumberFormatException e) {
      try {
        // Try parsing the string as a double
        Double.parseDouble(str);
        return true;
      } catch (NumberFormatException ex) {
        return false;
      }
    }
  }
}
