package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {
    @Mock
    Feline feline;

    @Test
    public void nomaleLionTest() {
        assertThrows(Exception.class,()->{
           new Lion("Сумка",feline);
        });
    }
    @Test
    public void getKittensTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самка",feline);
        assertEquals(1,lion.getKittens());
    }
    @Test
    public void getFoodTest() throws Exception {
        List<String> expect = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expect);
        Lion lion = new Lion("Самка",feline);
        assertEquals(expect,lion.getFood());
    }


}
