import java.util.Date;

public class SmsFlex2000 implements PackageType{
    private final int price = 30;
    private final int smsRight = 2000;
    private int remainSmsRight = 2000;
    private final double exceedPrice = 0.1;
    private final int validDate = 30;
    private Date soldDate;
    private boolean payExceedPrice = false;
    private double totalExceedPrice = 0.0;


    public int getSmsRight() {
        return 2000;
    }

    public int getRemainSmsRight() { return remainSmsRight; }

    public void setRemainSmsRight(int remainSmsRight) { this.remainSmsRight = remainSmsRight; }

    @Override
    public double getTotalExceedPrice() {
        return totalExceedPrice;
    }
    @Override
    public void setTotalExceedPrice(double totalExceedPrice) {
        this.totalExceedPrice = totalExceedPrice;
    }

    @Override
    public int getRemainMessageRight() {
        return smsRight;
    }

    @Override
    public String getPackageType() { return "flex"; }

    @Override
    public Date getSoldDate() {
        return new Date();
    }

    @Override
    public Date setSoldDate(Date soldDate) {
        return new Date();
    }

    @Override
    public String getMessageType() { return "sms"; }

    @Override
    public boolean sendMessage() {
        if(getRemainSmsRight() > 0){
            setRemainSmsRight(getRemainSmsRight()-1);
        }else{
            setTotalExceedPrice(exceedPrice);
        }
        return true;
    }


}
