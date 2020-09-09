import java.util.Date;

public class EmailFlex2000 implements PackageType{
    private final double price = 7.5;
    private int remainEmailRight = 2000;
    private final int validDate = 30;
    private Date soldDate;
    private boolean payExceedPrice = false;
    private double totalExceedPrice;

    public int getEmailRight() { return 2000; }

    public int getRemainEmailRight() { return remainEmailRight; }

    public void setRemainEmailRight(int remainEmailRight) { this.remainEmailRight = remainEmailRight; }

    public double getExceedPrice() {
        return 0.03;
    }

    @Override
    public double getTotalExceedPrice() {
        return totalExceedPrice;
    }

    @Override
    public void setTotalExceedPrice(double totalExceedPrice) {
        this.totalExceedPrice = totalExceedPrice;
    }

    @Override
    public String getPackageType() { return "flex"; }

    @Override
    public int getRemainMessageRight() {
        return remainEmailRight;
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
    public String getMessageType() { return "email"; }

    @Override
    public boolean sendMessage() {
        if(getRemainEmailRight() > 0){
            setRemainEmailRight(getEmailRight()-1);
        }else{
            setTotalExceedPrice(getTotalExceedPrice() + getExceedPrice());
        }
        return true;
    }




}
