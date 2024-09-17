package AssertJ.n2exercise1;
import AssertJ.n2exercise1.Dog;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class DogTest {
    @Test
    public void objectsAreEqual() {
        Dog dog1 = new Dog("Rex", 5.0f);
        Dog dog1Copy = new Dog("Rex", 5.0f);
        assertThat(dog1).usingRecursiveComparison().isEqualTo(dog1Copy);
    }
    @Test
    public void objectsAreNotEqual() {
        Dog dog1 = new Dog("Rex", 5.0f);
        Dog dog2 = new Dog("Odin", 3.5f);
        assertThat(dog1).usingRecursiveComparison().isNotEqualTo(dog2);
    }


}
