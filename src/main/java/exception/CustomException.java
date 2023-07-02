package exception;

public class CustomException extends Exception{
    int errorCode;
    String errorMsg;

    CustomException(int errorCode, String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
