import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class EmailFlexTest {
    @Test
    public void it_should_return_default_email_right(){
        //given
        EmailFlex2000 emailFlex = new EmailFlex2000();
        //when
        int remainEmailRight = emailFlex.getRemainEmailRight();
        //then
        Assert.assertEquals(remainEmailRight,2000);
    }
    @Test
    public void it_should_return_decrease_email_right_after_send(){
        //given
        EmailFlex2000 emailFlex = new EmailFlex2000();
        //when
        emailFlex.sendMessage();
        int remainEmailRight = emailFlex.getRemainEmailRight();
        //then
        Assert.assertEquals(remainEmailRight,1999);
    }
    @Test
    public void it_should_return_zero_email_right(){
        //given
        EmailFlex2000 emailFlex = new EmailFlex2000();
        //when
        emailFlex.setRemainEmailRight(0);
        int remainEmailRight = emailFlex.getRemainEmailRight();
        //then
        Assert.assertEquals(remainEmailRight,0);
    }

    @Test
    public void it_should_return_nonzero_total_exceed_price(){
        //given
        EmailFlex2000 emailFlex = new EmailFlex2000();
        //when
        emailFlex.setRemainEmailRight(0);
        emailFlex.sendMessage();
        double totalExceedPrice = emailFlex.getTotalExceedPrice();
        //then
        Assert.assertNotEquals(totalExceedPrice,0);
    }
    @Test
    public void it_should_return_3_times_total_exceed_price(){
        //given
        EmailFlex2000 emailFlex = new EmailFlex2000();
        //when
        emailFlex.setRemainEmailRight(0);
        emailFlex.sendMessage();
        emailFlex.sendMessage();
        emailFlex.sendMessage();
        double totalExceedPrice = emailFlex.getTotalExceedPrice();
        //then
        Assert.assertEquals(totalExceedPrice,0.09, 0);
    }
    @Test
    public void it_should_return_flex_as_package_type(){
        //given
        EmailFlex2000 emailFlex = new EmailFlex2000();
        //when
        String packageType = emailFlex.getPackageType();
        //then
        Assert.assertEquals(packageType,"flex");

    } @Test
    public void it_should_return_email_as_message_type(){
        //given
        EmailFlex2000 emailFlex = new EmailFlex2000();
        //when
        String messageType = emailFlex.getMessageType();
        //then
        Assert.assertEquals(messageType,"email");
    }
}
