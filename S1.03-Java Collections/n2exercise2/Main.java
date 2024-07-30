package n2exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<Restaurant>();

        restaurants.add(new Restaurant("McDonald's", 5));
        restaurants.add(new Restaurant("KFC", 3));
        restaurants.add(new Restaurant("KFC", 3));
        restaurants.add(new Restaurant("KFC", 2));
        restaurants.add(new Restaurant("McDonald's", 5));
        restaurants.add(new Restaurant("McDonald's", 3));
        restaurants.add(new Restaurant("Abat", 4));
        System.out.println(restaurants);


        List<Restaurant> list = new ArrayList<>(restaurants);
        Collections.sort(list);
        System.out.println(list);
    }
}
