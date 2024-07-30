package n2exercise2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {


    private String name;
    private int rating;
    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if(o == null) return false;
        if (!(o instanceof Restaurant)) return false;
        Restaurant other = (Restaurant) o;
        return  (this.name.equals(other.name) && this.rating == other.rating);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }
    @Override
    public String toString() {
        return "Name: " + name +" Rating: " + rating;
    }
    @Override
    public int compareTo(Restaurant o) {
        if(this.name.compareTo(o.name) != 0){
            return this.name.compareTo(o.name);
        } else {
            return this.rating - o.rating;
        }
    }
}
