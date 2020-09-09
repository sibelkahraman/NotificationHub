import Exception.CompanyHasMessageTypeException;
import Exception.NoPackageTypeException;
import Exception.NoSmsRightException;

import java.util.Date;

public class ValidateCompany {
    public boolean companyHasPackageType(Company firm, String packageType){
        if (firm.getPurchasedPackages().get(0).getPackageType().equals(packageType)) return true;
        else throw new NoPackageTypeException(firm.getLanguage().NoPackageTypeMessage());
    }
    public boolean companyHasValidMessageType(Company firm, String messageType){
        for (PackageType pack :firm.getPurchasedPackages()) {
            if(pack.getMessageType().equals(messageType)){
                return true;
            }
        }
        throw new CompanyHasMessageTypeException(firm.getLanguage().NoMessageType()); //return false


    }

    public boolean companyHasMessageRight(Company firm, String messageType){

        for (PackageType pack :firm.getPurchasedPackages()) {
            if(pack.getMessageType().equals(messageType) && pack.getRemainMessageRight() >0){
                return true;
            }
        }
        throw new NoSmsRightException(firm.getLanguage().NoSmsRightMessage());
    }

    public boolean companyInBlackList(Company firm){
        return firm.getIsBlackList();
    }

//    public boolean companyPackageTypeIsFlex(Company firm){
//        return (firm.getPurchasedPackages().getPackageType()).equals("flex");
//    }

    public boolean companyDelayPayPrice(Company firm){
        Date now = new Date();
        for (PackageType pack :firm.getPurchasedPackages()) {
            System.out.println(pack);
            if((now.getTime() - pack.getSoldDate().getTime()) > 60  && pack.getTotalExceedPrice() > 0){
                //throw new CompanyHasMessageTypeException(firm.getLanguage().blackListMessage());
                return true;
            }
        }
        return false;


    }


}
