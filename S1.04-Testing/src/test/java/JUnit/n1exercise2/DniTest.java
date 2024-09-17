package JUnit.n1exercise2;
import JUnit.n1exercise2.CalculateDNI;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DniTest {
    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "77678123, Q",
            "77777777, B",
            "12779769, A",
            "78456445, H",
    })
    public void testCalculateDNI(int DNINumber, char letter) {
        char result = CalculateDNI.calculateDNI(DNINumber);
        assertEquals(letter,result);
    }
}
