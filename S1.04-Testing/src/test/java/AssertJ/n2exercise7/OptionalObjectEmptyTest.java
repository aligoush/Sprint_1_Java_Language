package AssertJ.n2exercise7;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.Optional;

public class OptionalObjectEmptyTest {
    @Test
    public void optionalObjectEmpty() {
        Optional object = Optional.empty();
        assertThat(object).isEmpty();
    }
}
