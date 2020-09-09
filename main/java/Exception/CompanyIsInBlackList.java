package Exception;

public class CompanyIsInBlackList extends RuntimeException{
    public CompanyIsInBlackList(String message){
        super(message);
    }
}
