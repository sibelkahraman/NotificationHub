import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SmsFixTest {
    @Test
    public void it_should_return_default_sms_right(){
        //given
        SmsFix1000 smsFix = new SmsFix1000();
        //when
        int remainSmsRight = smsFix.getRemainSmsRight();
        //then
        Assert.assertEquals(remainSmsRight,1000);
    }
    @Test
    public void it_should_return_decrease_sms_right_after_send(){
        //given
        SmsFix1000 smsFix = new SmsFix1000();
        //when
        smsFix.sendMessage();
        int remainSmsRight = smsFix.getRemainSmsRight();
        //then
        Assert.assertEquals(remainSmsRight,999);
    }
    @Test
    public void it_should_return_zero_sms_right(){
        //given
        SmsFix1000 smsFix = new SmsFix1000();
        //when
        smsFix.setRemainSmsRight(0);
        int remainSmsRight = smsFix.getRemainSmsRight();
        //then
        Assert.assertEquals(remainSmsRight,0);
    }

    @Test
    public void it_should_return_nonzero_total_exceed_price(){
        //given
        SmsFix1000 smsFix = new SmsFix1000();
        //when
        smsFix.setRemainSmsRight(0);
        smsFix.sendMessage();
        double totalExceedPrice = smsFix.getTotalExceedPrice();
        //then
        Assert.assertNotEquals(totalExceedPrice,0);
    }
    @Test
    public void it_should_return_package_price_for_totalExceedPrice(){
        //given
        SmsFix1000 smsFix = new SmsFix1000();
        //when
        smsFix.setRemainSmsRight(0);
        smsFix.sendMessage();
        smsFix.sendMessage();
        smsFix.sendMessage();
        double totalExceedPrice = smsFix.getTotalExceedPrice();
        //then
        Assert.assertEquals(totalExceedPrice,20,0);
        //Assert.assertEquals(totalExceedPrice,20);
    }
    @Test
    public void it_should_return_fix_as_package_type(){
        //given
        SmsFix1000 smsFix = new SmsFix1000();
        //when
        String packageType = smsFix.getPackageType();
        //then
        Assert.assertEquals(packageType,"fix");

    } @Test
    public void it_should_return_sms_as_message_type(){
        //given
        SmsFix1000 smsFix = new SmsFix1000();
        //when
        String messageType = smsFix.getMessageType();
        //then
        Assert.assertEquals(messageType,"sms");

    }
}
