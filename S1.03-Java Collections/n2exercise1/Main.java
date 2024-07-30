package n2exercise1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<Restaurant>();

        restaurants.add(new Restaurant("McDonald's", 5));
        restaurants.add(new Restaurant("KFC", 3));
        restaurants.add(new Restaurant("KFC", 3));
        restaurants.add(new Restaurant("McDonald's", 5));
        restaurants.add(new Restaurant("McDonald's", 3));
        System.out.println(restaurants);
    }
}
