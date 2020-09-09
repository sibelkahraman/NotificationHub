package Exception;

public class TurkishException extends Exception implements Exceptions {
    @Override
    public void NoSmsRightException() {
        System.out.println("Sms Kullanım Hakkınız Bulunmamaktadır");
    }

    @Override
    public void NoPackageTypeException() {
        System.out.println("Uygun Paket Tipiniz Bulunmamaktadır");
    }

    @Override
    public void CompanyIsInBlackList() {
        System.out.println("Şirket Kara Listeye Alınmıştır");
    }
}
