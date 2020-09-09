package Exception;

public class English implements Language{
    @Override
    public String blackListMessage() { return "You Are In BlackList!";}

    @Override
    public String NoPackageTypeMessage() {
        return "You Do Not Have Right Package Type!";
    }

    @Override
    public String NoEmailRightMessage() {
        return "You Have Not Email Right!";
    }

    @Override
    public String NoSmsRightMessage() {
        return "You Do Not Have Sms Right!";
    }

    @Override
    public String NoMessageType() {
        return "You Dont Have Valid Message Type";
    }
}
