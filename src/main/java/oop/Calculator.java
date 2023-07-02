package oop;

import java.util.Scanner;

class Addition implements Calculate {   //is A
  @Override
  public double calculate(double a, double b) {
    return a + b;
  }

  @Override
  public void printOperation() {
    System.out.println("Addition!!!");
  }
}

class Multiplication implements Calculate {

  public double calculate(double a, double b) {
    return a * b;
  }

  @Override
  public void printOperation() {
    System.out.println("Multiplication!!");
  }

}

class Division implements Calculate {

  public double calculate(double a, double b) {
    return a / b;
  }

  @Override
  public void printOperation() {
    System.out.println("Division!!");
  }

}

public class Calculator {
  static Calculate calculateObj; //reference of Calculate  // has A relationship

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to calculator program..");

    System.out.println("Enter two double numbers. Enter first num : ");
    double a = sc.nextDouble();

    System.out.println("Enter second num : ");
    double b = sc.nextDouble();

    System.out.println("Choose operation : \n 1. Addition \n 2. Multiplication " +
        "\n 3. Division");
    System.out.println("Enter your choice .. ");
    int choice = sc.nextInt();
    double result = 0.0;
    switch (choice) {
      case 1: {
        System.out.println("Result is -- :" + performOperation(a, b, "Add"));
        break;
      }
      case 2: {
        System.out.println("Result is -- :" + performOperation(a, b, "Multiply"));
        break;
      }
      case 3: {
        System.out.println("Result is -- :" + performOperation(a, b, "Divide"));
        break;
      }
      default:
        System.out.println("Please enter a valid choice!!");

    }

  }

  public static double performOperation(double num1, double num2, String operation) {
    if (operation.equalsIgnoreCase("Add")) {
      calculateObj = new Addition();
      return calculateObj.calculate(num1, num2);
    } else if (operation.equalsIgnoreCase("Multiply")) {
      calculateObj = new Multiplication();
      return calculateObj.calculate(num1, num2);
    } else if (operation.equalsIgnoreCase("Divide")) {
      calculateObj = new Division();
      return calculateObj.calculate(num1, num2);
    }
    return 0;
  }

}
