package n1exercise1;

import java.util.Objects;

public class Month {
    private String name;
    public Month(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if(o == null) return false;
        if (!(o instanceof Month other)) return false;
        return  (this.name == null && other.name == null)
                || (this.name != null && this.name.equals(other.name));
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
