package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {
    @Mock
    Feline feline;

    @Test
    public void getSoundTest(){
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу",cat.getSound());
    }
    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expect = List.of("Животные", "Птицы", "Рыба"); 
        Mockito.when(feline.eatMeat()).thenReturn(expect);//тут мокирую feline
        List<String> result = cat.getFood();//тут испольузю кота
        assertEquals(expect,result);// и тут тоже использую кота
    }
}
