package feline;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParmTest {
    private final String sex;
    private final boolean expect;

    public LionParmTest(String sex, boolean result) {
        this.sex = sex;
        this.expect = result;
    }
    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] kittensAndResult() {
        return new Object[][]{
                {"Самец",true},
                {"Самка",false}
        };
    }

    @Test
    public void maneLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex,feline);
        assertEquals(expect,lion.doesHaveMane());
    }
}
