import java.util.Date;

public interface PackageType {
    boolean sendMessage();
    String getPackageType();
    String getMessageType();
    //boolean setPackageRight(int remainRight);
    int getRemainMessageRight();
    Date getSoldDate();
    Date setSoldDate(Date soldDate);
    //double getExceedPrice();
    void setTotalExceedPrice(double exceedPrice);
    double getTotalExceedPrice();
}
