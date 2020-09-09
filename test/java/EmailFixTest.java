import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class EmailFixTest {
    @Test
    public void it_should_return_default_email_right(){
        //given
        EmailFix1000 emailFix = new EmailFix1000();
        //when
        int remainEmailRight = emailFix.getRemainEmailRight();
        //then
        Assert.assertEquals(remainEmailRight,1000);
    }
    @Test
    public void it_should_return_decrease_email_right_after_send(){

        //given
        EmailFix1000 emailFix = new EmailFix1000();
        //when
        emailFix.sendMessage();
        int remainEmailRight = emailFix.getRemainEmailRight();
        //then
        Assert.assertEquals(remainEmailRight,999);
    }
    @Test
    public void it_should_return_zero_email_right(){
        //given
        EmailFix1000 emailFix = new EmailFix1000();
        //when
        emailFix.setRemainEmailRight(0);
        int remainEmailRight = emailFix.getRemainEmailRight();
        //then
        Assert.assertEquals(remainEmailRight,0);
    }

    @Test
    public void it_should_return_nonzero_total_exceed_price(){
        //given
        EmailFix1000 emailFix = new EmailFix1000();
        //when
        emailFix.setRemainEmailRight(0);
        emailFix.sendMessage();
        double totalExceedPrice = emailFix.getTotalExceedPrice();
        //then
        Assert.assertNotEquals(totalExceedPrice,0);
    }
    @Test
    public void it_should_return_package_price_for_totalExceedPrice(){
        //given
        EmailFix1000 emailFix = new EmailFix1000();
        //when
        emailFix.setRemainEmailRight(0);
        emailFix.sendMessage();
        emailFix.sendMessage();
        emailFix.sendMessage();
        double totalExceedPrice = emailFix.getTotalExceedPrice();
        //then
        Assert.assertEquals(totalExceedPrice,10,0);
    }
    @Test
    public void it_should_return_fix_as_package_type(){
        //given
        EmailFix1000 emailFix = new EmailFix1000();
        //when
        String packageType = emailFix.getPackageType();
        //then
        Assert.assertEquals(packageType,"fix");

    } @Test
    public void it_should_return_email_as_message_type(){
        //given
        EmailFix1000 emailFix = new EmailFix1000();
        //when
        String messageType = emailFix.getMessageType();
        //then
        Assert.assertEquals(messageType,"email");

    }
}
