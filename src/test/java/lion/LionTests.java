package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

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
    @Test
    public void getKittensTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самка",feline);
        assertEquals(1,lion.getKittens());

    }


}
