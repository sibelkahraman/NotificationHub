import Exception.English;

import java.util.ArrayList;
import java.util.Date;


public class Main {
    public static void main(String [] args){
        Date date = new Date();
        Company firm1 = new Company();
        SendMessage sendMessage = new SendMessage();
        SmsFix1000 SmsFixPackage = new SmsFix1000();
        EmailFlex2000 EmailFlexPackage = new EmailFlex2000();
        ValidateCompany validate = new ValidateCompany();
        English turkish = new English();
        //firm1.setName("Kahraman");
        firm1.setPurchasedPackages(SmsFixPackage);
        firm1.setPurchasedPackages(EmailFlexPackage);
        System.out.println(firm1.getPurchasedPackages());
                //.setSoldDate(new Date());
        firm1.setLanguage(turkish);
        ArrayList<String> receivers = new ArrayList<String>();
        receivers.add("sms");
        receivers.add("email");
        receivers.add("sms");
        receivers.add("email");
        receivers.add("sms");
        for(int i = 0; i < (receivers).size(); i++) {
            if(validate.companyHasValidMessageType(firm1,receivers.get(i)) && validate.companyHasMessageRight(firm1, receivers.get(i))) {
                for (PackageType pack : firm1.getPurchasedPackages()) {
                    if (pack.getMessageType().equals(receivers.get(i))) {
                        sendMessage.sendMessage(firm1, receivers.get(i));
                        //throw new CompanyHasMessageTypeException(firm.getLanguage().CompanyHasMessageTypeMessage()); //return false
                    }

                }
            }
            else if(validate.companyHasValidMessageType(firm1,receivers.get(i))){
                if(validate.companyHasValidMessageType(firm1,receivers.get(i)) && validate.companyHasMessageRight(firm1, receivers.get(i))) {
                    for (PackageType pack : firm1.getPurchasedPackages()) {
                        if(pack.getPackageType() == "fix"){
                            pack.setTotalExceedPrice(pack.getTotalExceedPrice() );
                        }
                    }
                }
            }

        }

//        firm1.setPurchasedPackages(a);
//        SendMessage sendMessage = new SendMessage();
//        sendMessage.sendMessage(firm1,"sms");
//        ValidateCompany validation = new ValidateCompany();
//        System.out.println(firm1.getPurchasedPackages().getPackageType());
//        sendMessage.sendMessage(firm1,"sms");
//        sendMessage.sendMessage(firm1,"sms");
//        sendMessage.sendMessage(firm1,"sms");
//
//        System.out.println("company V:" + validation.companyHasMessageType(firm1,"sms"));
//        System.out.println("company R:" + validation.companyHasMessageRight(firm1));
//        System.out.println("company p:" + validation.companyPackageTypeIsFlex(firm1));
//        System.out.println("company E:" + validation.companyDelayExceedPrice(firm1));
//        System.out.println(a.getSoldDate());
//        System.out.println(firm1.getPurchasedPackages().getPackageRight());
//        sendMessage.sendMessage(firm1,"sms");
//        System.out.println(firm1.getPurchasedPackages().getPackageRight());
//        firm1.getPurchasedPackages().setSoldDate(new Date());
//
//        System.out.println(firm1.getPurchasedPackages().getSoldDate());
    }
}
