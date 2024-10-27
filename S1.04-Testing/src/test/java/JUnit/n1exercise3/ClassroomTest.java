package JUnit.n1exercise3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassroomTest {
    @Test
    public void arrayIndexOutOfBoundsException() {
        Classroom classroom = new Classroom();
        ArrayIndexOutOfBoundsException exception =
                assertThrows(ArrayIndexOutOfBoundsException.class, classroom::launchException);
        assertEquals("Index 4 out of bounds for length 4", exception.getMessage());
    }
}
