package calculator_assignment;


import java.util.Scanner;


class Calculate {

  double calculate(double a, double b, String operation) {

    if (operation.equalsIgnoreCase("Add")) {
      return a + b;
    } else if (operation.equalsIgnoreCase("Multiply")) {
      return a * b;
    } else if (operation.equalsIgnoreCase("Divide")) {
      return a / b;
    }
    return 0;
  }

}

public class Calculator {

  public static void main(String[] args) {
    Calculate obj = new Calculate();
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to calculator program..");

    System.out.println("Enter a double num : ");
    double h = sc.nextDouble();
    System.out.println("Enter a another double num : ");
    double j = sc.nextDouble();


    System.out.println("Choose operation : \n 1. Addition \n 2. Multiplication " +
        "\n 3. Division");
    System.out.println("Enter your choice .. ");
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("Sum=" + obj.calculate(h, j, "Add"));
        break;
      case 2:
        System.out.println("Product=" + obj.calculate(h, j, "Multiply"));
        break;
      case 3:
        System.out.println("Divide=" + obj.calculate(h, j, "Divide"));
        break;
    }

//	    obj.sum(20,20);
//	    obj.sum(20,20,20);
//	    obj.sum(2, 4);


  }
}


