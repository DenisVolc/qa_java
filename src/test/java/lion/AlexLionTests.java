package lion;

import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class AlexLionTests {
    @Mock
    Feline feline;
    @Test
    public void getFriendsTest() throws Exception {
        AlexTheLion alex = new AlexTheLion(feline);
        List<String> expect = List.of("Марти", "Глория", "Мелман");
        assertEquals(expect,alex.getFriends());
    }
    @Test
    public void getPlaceOfLivingTest() throws Exception {
        AlexTheLion alex = new AlexTheLion(feline);
        String expect = "Нью-Йоркский зоопарк";
        assertEquals(expect,alex.getPlaceOfLiving());
    }
    @Test
    public void getKittensTest() throws Exception {
        AlexTheLion alex = new AlexTheLion(feline);
        int expect = 0;
        assertEquals(expect,alex.getKittens());
    }

}
