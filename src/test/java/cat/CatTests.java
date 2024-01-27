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
    Cat cat = new Cat(feline);
    @Test
    public void getSoundTest(){
        Assert.assertEquals("Мяу",cat.getSound());
    }
    @Test//TODO исправить эту шляпу
    public void getFoodTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));//тут мокирую feline
        List<String> result = cat.getFood();//тут испольузю кота
        assertEquals(List.of("Животные", "Птицы", "Рыба"),result);// и тут тоже использую кота
    }
}
