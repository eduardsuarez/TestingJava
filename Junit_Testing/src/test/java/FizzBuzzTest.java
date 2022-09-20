import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FizzBuzzTest {

    private FizzBuzz game;
    @Before
    public void before(){
        game = new FizzBuzz();

    }

    @Test
    public void should_returnNumberWhenNotAMultiple3or5() {

        List<String> numbersList = game.getNumbers();
        Assert.assertEquals("1", numbersList.get(0));
        Assert.assertEquals("2", numbersList.get(1));
        Assert.assertEquals("7", numbersList.get(6));
        Assert.assertEquals("13", numbersList.get(12));

    }
    @Test
    public void should_returnFizzWhenAMultipleOf3() {

        List<String> numbersList = game.getNumbers();
        Assert.assertEquals("Fizz", numbersList.get(2));
        Assert.assertEquals("Fizz", numbersList.get(5));
        Assert.assertEquals("Fizz", numbersList.get(8));
        Assert.assertEquals("Fizz", numbersList.get(11));

    }
    @Test
    public void should_returnBuzzWhenAMultipleOf5() {

        List<String> numbersList = game.getNumbers();
        Assert.assertEquals("Buzz", numbersList.get(4));
        Assert.assertEquals("Buzz", numbersList.get(9));
        Assert.assertEquals("Buzz", numbersList.get(19));
        Assert.assertEquals("Buzz", numbersList.get(24));

    }

    @Test
    public void should_returnFizzBuzzWhenAMultipleOf3And5() {

        List<String> numbersList = game.getNumbers();
        Assert.assertEquals("FizzBuzz", numbersList.get(14));
        Assert.assertEquals("FizzBuzz", numbersList.get(29));
        Assert.assertEquals("FizzBuzz", numbersList.get(59));
        Assert.assertEquals("FizzBuzz", numbersList.get(89));

    }
}
