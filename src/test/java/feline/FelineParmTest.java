package feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParmTest {
    private final int kittens;
    private final int expect;

    public FelineParmTest(int kittens, int result) {
        this.kittens = kittens;
        this.expect = result;
    }
    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] kittensAndResult() {
        return new Object[][]{
                {0,0},
                {1,1},
                {2147483647,2147483647},
                //{-1,-1} проверяется в FelineTests.getKittensMinusOneTest()
        };
    }
    @Test
    public void getKittensTest(){
        Feline testFeline = new Feline();
        Assert.assertEquals(expect,testFeline.getKittens(kittens));
    }
}
