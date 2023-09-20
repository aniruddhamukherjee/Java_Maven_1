package exception;

public class CustomException1 extends Exception { //rule 1
  public String getErrorMessage() {
    return errorMessage;
  }

  private String errorMessage;

  public CustomException1(String error) { //constructor
    super(error); //rule 2 passing the error message to Exception class

    errorMessage = error;
  }

}