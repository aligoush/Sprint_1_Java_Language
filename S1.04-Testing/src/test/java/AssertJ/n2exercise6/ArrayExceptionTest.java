package AssertJ.n2exercise6;
import AssertJ.n2exercise6.Main;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArrayExceptionTest {
    @Test
    public void testArrayIndexOutOfBounds() {
        assertThatThrownBy(() -> Main.provokeArrayIndexOutOfBounds())
                .isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }

}
