import org.junit.Assert;
import org.junit.jupiter.api.Test;
import Exception.*;
import java.util.ArrayList;

public class CompanyTest {
    @Test
    public void it_should_return_smsFlex_and_emailFix_packages(){
        //Given
        Company company = new Company();
        SmsFlex2000 smsFlex = new SmsFlex2000();
        EmailFix1000 emailFix = new EmailFix1000();
        //When
        company.setPurchasedPackages(smsFlex);
        company.setPurchasedPackages(emailFix);
        ArrayList<PackageType> purchasedPackages = company.getPurchasedPackages();
        ArrayList<PackageType> list = new ArrayList<PackageType>();
        list.add(smsFlex);
        list.add(emailFix);
        //Then
        Assert.assertEquals(list.toString(), purchasedPackages.toString());
    }

    @Test
    public void it_should_return_english_blackList_error_message(){
        //Given
        Company company = new Company();
        English english = new English();
        //When
        company.setLanguage(english);
        //Then
        Assert.assertEquals("You Are In BlackList!",company.getLanguage().blackListMessage());

    }
    @Test
    public void it_should_return_english_noPackageType_error_message(){
        //Given
        Company company = new Company();
        English english = new English();
        //When
        company.setLanguage(english);
        //Then
        Assert.assertEquals("You Do Not Have Right Package Type!",company.getLanguage().NoPackageTypeMessage());

    }@Test
    public void it_should_return_english_emailRight_error_message(){
        //Given
        Company company = new Company();
        English english = new English();
        //When
        company.setLanguage(english);
        //Then
        Assert.assertEquals("You Have Not Email Right!",company.getLanguage().NoEmailRightMessage());

    }@Test
    public void it_should_return_english_noSmsRight_error_message(){
        //Given
        Company company = new Company();
        English english = new English();
        //When
        company.setLanguage(english);
        //Then
        Assert.assertEquals("You Do Not Have Sms Right!",company.getLanguage().NoSmsRightMessage());

    }@Test
    public void it_should_return_english_messageType_error_message(){
        //Given
        Company company = new Company();
        English english = new English();
        //When
        company.setLanguage(english);
        //Then
        Assert.assertEquals("You Dont Have Valid Message Type",company.getLanguage().NoMessageType());

    }
    @Test
    public void it_should_return_turkish_blackList_error_message(){
        //Given
        Company company = new Company();
        Turkish turkish = new Turkish();
        //When
        company.setLanguage(turkish);
        //Then
        Assert.assertEquals("Kara Listeye Alındınız!",company.getLanguage().blackListMessage());

    }
    @Test
    public void it_should_return_turkish_noPackageType_error_message(){
        //Given
        Company company = new Company();
        Turkish turkish = new Turkish();
        //When
        company.setLanguage(turkish);
        //Then
        Assert.assertEquals("Uygun Paket Tipiniz Bulunmamaktadır!",company.getLanguage().NoPackageTypeMessage());

    }@Test
    public void it_should_return_turkish_emailRight_error_message(){
        //Given
        Company company = new Company();
        Turkish turkish = new Turkish();
        //When
        company.setLanguage(turkish);
        //Then
        Assert.assertEquals("Email Hakkınız Bulunmamaktadır!",company.getLanguage().NoEmailRightMessage());

    }@Test
    public void it_should_return_turkish_noSmsRight_error_message(){
        //Given
        Company company = new Company();
        Turkish turkish = new Turkish();
        //When
        company.setLanguage(turkish);
        //Then
        Assert.assertEquals("Sms Hakkınız Bulunmamaktadır!",company.getLanguage().NoSmsRightMessage());

    }@Test
    public void it_should_return_turkish_messageType_error_message(){
        //Given
        Company company = new Company();
        Turkish turkish = new Turkish();
        //When
        company.setLanguage(turkish);
        //Then
        Assert.assertEquals("Uygun Mesaj Tipiniz Bulunmamaktadır!",company.getLanguage().NoMessageType());

    }
}
