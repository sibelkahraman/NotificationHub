import org.junit.Assert;
import org.junit.jupiter.api.Test;
import Exception.*;

public class ValidationTest {
    @Test
    public void it_should_return_true_for_companyHasPackageType(){
        //Given
        Company company = new Company();
        SmsFlex2000 smsFlex = new SmsFlex2000();
        ValidateCompany validation = new ValidateCompany();
        company.setPurchasedPackages(smsFlex);
        //When
        boolean returnValue = validation.companyHasPackageType(company,"flex");
        //Then
        Assert.assertEquals(true,returnValue);
    }
    @Test
    public void it_should_return_error_for_companyHasPackageType(){
        //Given
        Company company = new Company();
        SmsFlex2000 smsFlex = new SmsFlex2000();
        ValidateCompany validation = new ValidateCompany();
        company.setPurchasedPackages(smsFlex);
        Turkish turkish = new Turkish();
        company.setLanguage(turkish);
        //When
            //Throwable throwable = catchThrowable(() -> validation.companyHasPackageType(company,"fix"));
        //Then
            //AssertThat(throwable).hasMessageContaining("Uygun Paket Tipiniz Bulunmamaktadır!");
    }
    @Test
    public void it_should_return_true_for_companyHasValidMessageType(){
        //Given
        Company company = new Company();
        SmsFlex2000 smsFlex = new SmsFlex2000();
        ValidateCompany validation = new ValidateCompany();
        company.setPurchasedPackages(smsFlex);
        Turkish turkish = new Turkish();
        company.setLanguage(turkish);
        //When
        boolean returnValue = validation.companyHasValidMessageType(company,"sms");
        //Then
        Assert.assertEquals(true,returnValue);
    }
    @Test
    public void it_should_return_error_for_companyHasValidMessageType(){
        //Given
        Company company = new Company();
        SmsFlex2000 smsFlex = new SmsFlex2000();
        ValidateCompany validation = new ValidateCompany();
        company.setPurchasedPackages(smsFlex);
        Turkish turkish = new Turkish();
        company.setLanguage(turkish);
        //When
            //Throwable throwable = catchThrowable(() -> validation.companyHasValidMessageType(company,"email"));
        //Then
            //AssertThat(throwable).hasMessageContaining("Uygun Mesaj Tipiniz Bulunmamaktadır!");
    }
    @Test
    public void it_should_return_true_for_companyHasMessageRight(){
        //Given
        Company company = new Company();
        SmsFlex2000 smsFlex = new SmsFlex2000();
        ValidateCompany validation = new ValidateCompany();
        company.setPurchasedPackages(smsFlex);
        Turkish turkish = new Turkish();
        company.setLanguage(turkish);
        //When
        boolean returnValue = validation.companyHasMessageRight(company,"sms");
        //Then
        Assert.assertEquals(true,returnValue);
    }
    @Test
    public void it_should_return_error_for_companyHasMessageRight(){
        //Given
        Company company = new Company();
        SmsFlex2000 smsFlex = new SmsFlex2000();
        ValidateCompany validation = new ValidateCompany();
        company.setPurchasedPackages(smsFlex);
        Turkish turkish = new Turkish();
        company.setLanguage(turkish);
        //When
         //Throwable throwable = catchThrowable(() -> validation.companyHasMessageRight(company,"email"));
        //Then
        //AssertThat(throwable).hasMessageContaining("Sms Hakkınız Bulunmamaktadır!");
    }
}
