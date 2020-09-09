package Exception;

public class EnglishException implements Exceptions {
    @Override
    public void NoSmsRightException() {
        System.out.println("You Dont Have SMS Right");
    }

    @Override
    public void NoPackageTypeException() {
        System.out.println("You Do Not Have Right Package Type");

    }

    @Override
    public void CompanyIsInBlackList() {

    }
}
