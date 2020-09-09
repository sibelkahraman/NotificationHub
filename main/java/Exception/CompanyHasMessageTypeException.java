package Exception;

import javax.management.RuntimeErrorException;

public class CompanyHasMessageTypeException extends RuntimeException {
    public CompanyHasMessageTypeException(String message){
        super(new Error(message));
    }
}
