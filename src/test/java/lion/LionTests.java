package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class LionTests {
    @Mock
    Feline feline;
    @Test
    public void maleLionTest() throws Exception {
        Lion lion = new Lion("Самец",feline);
        boolean hasMane = true;
        assertEquals(hasMane,lion.doesHaveMane());
    }
    @Test
    public void femaleLionTest() throws Exception {
        Lion lion = new Lion("Самка",feline);
        boolean hasMane = false;
        assertEquals(hasMane,lion.doesHaveMane());
    }
    @Test(expected = Exception.class)
    public void nomaleLionTest() throws Exception {
        Lion lion = new Lion("Сумка",feline);
    }
    @Test
    public void getKittensTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самка",feline);
        assertEquals(1,lion.getKittens());

    }
    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).
                thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самка",feline);
        List expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected,lion.getFood());
    }


}
