package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException2 {

  public static void m1() throws IOException {
    FileInputStream fis = null;

    try {
      fis = new FileInputStream(
          "C:\\Users\\animukhe8\\OneDrive - Publicis Groupe\\Desktop\\testfile.txt");

      int data;
      while ((data = fis.read()) != -1) {   //error here
        // Process the data
        System.out.print((char) data);
      }
   // } catch (IOException e) {
   //   System.out.println("Error occurred while reading file");
    } finally {   //default logic
      System.out.println("ALWAYS execute this!!!!");
      if (fis != null) {  //if file is open
        fis.close();
      }
    }

  }

  public static void m2(String input) {
    try {
      m1();
    } catch (IOException exc) {
      System.out.println("Error occurred while reading file");
    }

    if (input != null) {
      System.out.println("Length = " + input.length()); //nullpointer exp
    }

    int n = 0;
    if (n != 0) {
      int x = 3 / n;
    }


    System.out.println("Proceeding with next code in m2.......");

    System.out.println("Proceeding with next code in m2.......");

    System.out.println("Proceeding with next code in m2.......");
  }

  public static void main(String[] args) throws Exception {
    // try {
    // m2(null);   //main to m2 to m1 to read()
    m1();
    // } catch (Exception x) {
    //   System.out.println("Error occurred");
    // }

    System.out.println("Proceeding with next code.......");
    System.out.println("Proceeding with next code.......");
    System.out.println("Proceeding with next code.......");
    System.out.println("Proceeding with next code.......");
  }
}
