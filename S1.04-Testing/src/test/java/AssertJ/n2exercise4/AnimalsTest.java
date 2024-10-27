package AssertJ.n2exercise4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.*;

public class AnimalsTest {
    ArrayList<Object> animals = new ArrayList<>();
    Dog dog;
    Cat cat;
    Bird bird;

    @BeforeEach
    public void beforeTest() {
        dog = new Dog("Odin");
        cat = new Cat("Garfield");
        bird = new Bird("Tweety");
        animals.add(dog);
        animals.add(cat);
        animals.add(bird);
    }

    @Test void arrayListOrder(){
        assertThat(animals).containsExactly(dog, cat, bird);
        assertThat(animals).containsExactlyInAnyOrder(bird, dog, cat);
    }

    @Test
    public void arrayListIfContainsObject() {
        assertThat(animals).containsOnlyOnce(dog);
        Bird bird2 = new Bird("Kooky");
        assertThat(animals).doesNotContain(bird2);
    }
}
