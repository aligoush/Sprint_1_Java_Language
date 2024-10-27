package AssertJ.n2exercise1;

import java.util.Objects;

public class Dog {
    private String name;
    private float weight;
    public Dog(String name, float weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Float.compare(weight, dog.weight) == 0 && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
