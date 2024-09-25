package n1exercise4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>();
        Collections.addAll(months, "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        months.forEach(System.out::println);
    }
}
