public class SendMessage {
    public void sendMessage(Company firm, String sendType){
        firm.getPurchasedPackages().get(0).sendMessage();
        //System.out.printf("%s is send by %s", sendType, firm.getName());
        //return false;

    }
}
