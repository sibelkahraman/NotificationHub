package Exception;

public class NoSmsRightException extends RuntimeException{
    public NoSmsRightException(String message){
        super(message);
    }
}
