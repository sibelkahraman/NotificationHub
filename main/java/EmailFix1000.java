import java.util.Date;

public class EmailFix1000 implements PackageType{
    private int remainEmailRight = 1000;
    private final int validDate = 30;
    private Date soldDate;
    private double totalExceedPrice;


    public int getPrice() { return 10; }

    public int getEmailRight() { return 1000; }

    public int getRemainEmailRight() { return remainEmailRight; }

    public void setRemainEmailRight(int emailRight) { this.remainEmailRight = emailRight; }

    @Override
    public double getTotalExceedPrice() { return totalExceedPrice; }

    @Override
    public void setTotalExceedPrice(double exceedPrice) { this.totalExceedPrice = exceedPrice; }

     @Override
    public String getPackageType() { return "fix"; }

    @Override
    public int getRemainMessageRight() { return remainEmailRight; }

    @Override
    public Date getSoldDate() { return new Date(); }

    @Override
    public Date setSoldDate(Date soldDate) { return new Date(); }

    //@Override
    //public double getExceedPrice() { return totalExceedPrice;}

    @Override
    public String getMessageType() { return "email"; }

    @Override
    public boolean sendMessage() {
        if (getRemainEmailRight() > 0) {
            setRemainEmailRight(getEmailRight()-1);
        }else{
            setTotalExceedPrice(getTotalExceedPrice() + getPrice());
            setRemainEmailRight(getEmailRight());
        }
        return true;
    }

}

