package feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {
    Feline testFeline = new Feline();
    @Test
    public void eatMeatTest() throws Exception {
        List<String> result = testFeline.eatMeat();
        assertEquals( List.of("Животные", "Птицы", "Рыба"),result);
    }
    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи",testFeline.getFamily());
    }
    @Test
    public void getKittensNoParmsTest(){
        assertEquals(1,testFeline.getKittens());
    }
    @Test
    public void getKittensMinusOneTest(){ // проверя что котят не может быть меньше нуля
        Assert.assertThrows(IndexOutOfBoundsException.class,()-> {
            testFeline.getKittens(-1);
        } );
    }



    
}