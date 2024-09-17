package AssertJ.n2exercise4;
import AssertJ.n2exercise4.Bird;
import AssertJ.n2exercise4.Cat;
import AssertJ.n2exercise4.Dog;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.*;

public class AnimalsTest {
    @Test
    public void arrayListOrderAndIfContainsObject() {
        Dog dog = new Dog("Odin");
        Cat cat = new Cat("Garfield");
        Bird bird = new Bird("Tweety");
        ArrayList<Object> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(bird);
        assertThat(animals).contains(dog, cat, bird);
        assertThat(animals).containsOnlyOnce(dog);
        Bird bird2 = new Bird("Kooky");
        assertThat(animals).doesNotContain(bird2);
    }
}
