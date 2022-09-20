import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void moneyTest(){
        String money = MoneyUtil.format(1000);
        Assert.assertEquals("$1000.00", money);
    }

    @Test
    public void negativemoneyTest(){
        String money = MoneyUtil.format(-1000);
        Assert.assertEquals("-$1000.00", money);
    }

    @Test
    public void euromoneyTest(){
        String money = MoneyUtil.format(-1000, "€");
        Assert.assertEquals("-€1000.00", money);
    }

    @Test(expected = IllegalArgumentException.class)
    public void notNullExceptionMoneyTest(){
         MoneyUtil.format(-1000, null);

    }

}
