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
//    @Test//TODO исправить эту шляпу
//    public void getFoodTest() throws Exception {
//        List<String> result = cat.getFood();//todo пофиксить
//        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
//        assertEquals(List.of("Животные", "Птицы", "Рыба"),result);
//    }



}
