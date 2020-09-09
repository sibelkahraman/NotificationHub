import java.util.Date;

public class SmsFix1000 implements PackageType{
    private int remainSmsRight = 1000;
    private final int validDate = 30;
    private Date soldDate;
    private double totalExceedPrice;

    public int getPrice() { return 20; }

    public int getSmsRight() { return 1000; }

    public int getRemainSmsRight() {
        return remainSmsRight;
    }

    public void setRemainSmsRight(int smsRight) {
        this.remainSmsRight = smsRight;
    }

    @Override
    public double getTotalExceedPrice() { return totalExceedPrice; }

    @Override
    public void setTotalExceedPrice(double exceedPrice) {
        this.totalExceedPrice = exceedPrice;
    }

    @Override
    public String getPackageType() { return "fix"; }

    @Override
    public int getRemainMessageRight() {
        return remainSmsRight;
    }

    @Override
    public Date getSoldDate() {
        return new Date();
    }

    @Override
    public Date setSoldDate(Date soldDate) {
        return new Date();
    }

    @Override
    public String getMessageType() {
        return "sms";
    }
    @Override
    public boolean sendMessage() {
        if(getRemainSmsRight() > 0){
            setRemainSmsRight(getRemainSmsRight() -1);
        }else{
            setTotalExceedPrice(getTotalExceedPrice() + getPrice());
            setRemainSmsRight(getSmsRight());
        }
        return true;
    }


}
