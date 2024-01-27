import com.example.Feline;
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
        assertEquals(result, List.of("Животные", "Птицы", "Рыба"));
    }
    
}