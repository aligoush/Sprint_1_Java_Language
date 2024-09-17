package AssertJ.n2exercise2;

import AssertJ.n2exercise2.Dog;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class DogTest {
    @Test
    public void referencesAreEqual() {
        Dog dog1 = new Dog("Rex", 5.0f);
        Dog dog1Copy = dog1;
        assertThat(dog1).isSameAs(dog1Copy);
    }
    @Test
    public void referencesAreNotEqual(){
        Dog dog1 = new Dog("Rex", 5.0f);
        Dog dog2 = new Dog("Odin", 3.5f);
        assertThat(dog1).isNotSameAs(dog2);
    }
}
