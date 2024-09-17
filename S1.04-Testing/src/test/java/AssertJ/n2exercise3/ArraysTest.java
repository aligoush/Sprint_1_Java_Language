package AssertJ.n2exercise3;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArraysTest {
    @Test
    public void arraysAreEqual() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        assertThat(array1).isEqualTo(array2);
    }
}
