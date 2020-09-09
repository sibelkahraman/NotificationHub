import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class SmsFlexTest {

    @Test
    public void it_should_return_default_sms_right(){
        //given
        SmsFlex2000 smsFlex = new SmsFlex2000();
        //when
        int remainSmsRight = smsFlex.getRemainSmsRight();
        //then
        Assert.assertEquals(remainSmsRight,2000);
    }
    @Test
    public void it_should_return_decrease_sms_right_after_send(){
        //given
        SmsFlex2000 smsFlex = new SmsFlex2000();
        //when
        smsFlex.sendMessage();
        int remainSmsRight = smsFlex.getRemainSmsRight();
        //then
        Assert.assertEquals(remainSmsRight,1999);
    }
    @Test
    public void it_should_return_zero_sms_right(){
        //given
        SmsFlex2000 smsFlex = new SmsFlex2000();
        //when
        smsFlex.setRemainSmsRight(0);
        int remainSmsRight = smsFlex.getRemainSmsRight();
        //then
        Assert.assertEquals(remainSmsRight,0);
    }

    @Test
    public void it_should_return_nonzero_total_exceed_price(){
        //given
        SmsFlex2000 smsFlex = new SmsFlex2000();
        //when
        smsFlex.setRemainSmsRight(0);
        smsFlex.sendMessage();
        double remainSmsRight = smsFlex.getTotalExceedPrice();
        //then
        Assert.assertNotEquals(remainSmsRight,0.0);
    }
    @Test
    public void it_should_return_2_times_total_exceed_price(){
        //given
        SmsFlex2000 smsFlex = new SmsFlex2000();
        //when
        smsFlex.setRemainSmsRight(0);
        smsFlex.sendMessage();
        smsFlex.sendMessage();
        double remainSmsRight = smsFlex.getTotalExceedPrice();
        //then
        Assert.assertNotEquals(remainSmsRight,0.2);
    }
    @Test
    public void it_should_return_flex_as_package_type(){
        //given
        SmsFlex2000 smsFlex = new SmsFlex2000();
        //when
        String packageType = smsFlex.getPackageType();
        //then
        Assert.assertEquals(packageType,"flex");

    } @Test
    public void it_should_return_sms_as_message_type(){
        //given
        SmsFlex2000 smsFlex = new SmsFlex2000();
        //when
        String messageType = smsFlex.getMessageType();
        //then
        Assert.assertEquals(messageType,"sms");

    }
}
