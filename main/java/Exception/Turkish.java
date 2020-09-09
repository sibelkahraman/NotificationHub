package Exception;

public class Turkish implements Language{
    @Override
    public String blackListMessage() {
        return "Kara Listeye Alındınız!";
    }
    @Override
    public String NoPackageTypeMessage() {
        return "Uygun Paket Tipiniz Bulunmamaktadır!";
    }

    @Override
    public String NoEmailRightMessage() {
        return "Email Hakkınız Bulunmamaktadır!";
    }

    @Override
    public String NoSmsRightMessage() {
        return "Sms Hakkınız Bulunmamaktadır!";
    }

    @Override
    public String NoMessageType() {
        return "Uygun Mesaj Tipiniz Bulunmamaktadır!";
    }
}
