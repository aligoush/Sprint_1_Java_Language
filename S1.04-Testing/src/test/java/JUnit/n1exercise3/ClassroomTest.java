package JUnit.n1exercise3;
import JUnit.n1exercise3.Classroom;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassroomTest {
    @Test
    public void arrayIndexOutOfBoundsException() {
        Classroom classroom = new Classroom();
        ArrayIndexOutOfBoundsException exception =
                assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                    throw new ArrayIndexOutOfBoundsException("expected message");
                });
        assertEquals("expected message", exception.getMessage());
    }
}
