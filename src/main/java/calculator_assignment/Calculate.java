package feb11;


public class Calculate {


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
