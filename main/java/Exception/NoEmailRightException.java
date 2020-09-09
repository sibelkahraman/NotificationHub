package Exception;

public class NoEmailRightException extends RuntimeException{
    public NoEmailRightException(String message){
        super(message);
    }
}
