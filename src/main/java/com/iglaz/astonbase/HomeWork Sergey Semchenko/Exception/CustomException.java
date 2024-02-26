package Exception;

public class CustomException extends Exception {

    Throwable exception;

    public CustomException() {
    }

    public CustomException (Exception e){
        exception = e;
    }
    @Override
    public String getMessage() {
        return "Custom exception!!!";
    }

    public static void getException() throws CustomException {
        throw new CustomException();
    }
}
