package AssertJ.n2exercise5;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.*;

public class MapTest {
    @Test
    public void mapContainsKey() {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John", 20);
        people.put("Jane", 41);
        people.put("Joe", 32);
        assertThat(people).containsKey("Joe");
    }
}
