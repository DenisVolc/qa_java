package feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParmTest {
    private final int kittens;
    private final int result;

    public FelineParmTest(int kittens, int result) {
        this.kittens = kittens;
        this.result = result;
    }
    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] kittensAndResult() {
        return new Object[][]{
                {0,0},
                {1,1},
                {-1,-1},//TODO тут наверное надо бы как-нибудь выкинуть ошибку о том,
                        // что котят не может быть отрицательное кол-во
        };
    }
    @Test
    public void getKittensTest(){
        Feline testFeline = new Feline();
        Assert.assertEquals(testFeline.getKittens(kittens),result);
    }
}
