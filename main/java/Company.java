import Exception.Language;

import java.util.ArrayList;

public class Company {
    private ArrayList<String> receivers;
    private ArrayList<PackageType> purchasedPackages = new ArrayList<PackageType>();
    private Language language;
    private Boolean isBlackList;

    public ArrayList<String> getReceivers() {
        return receivers;
    }

    public void setReceivers(ArrayList<String> receivers) {
        this.receivers = receivers;
    }

    public ArrayList<PackageType> getPurchasedPackages() {
        return this.purchasedPackages;
    }

    public void setPurchasedPackages(PackageType purchasedPackages) {
        this.purchasedPackages.add(purchasedPackages);
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Boolean getIsBlackList() {
        return isBlackList;
    }

    public void setIsBlackList(Boolean blackList) {
        this.isBlackList = blackList;
    }

    public void payExceedPrice(){
        ArrayList<PackageType> packages = getPurchasedPackages();
        for (PackageType pack: packages) {
            pack.setTotalExceedPrice(0);
        }
    }
}
