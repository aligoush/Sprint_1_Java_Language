package n1exercise3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>();
        Collections.addAll(months, "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        months.forEach(month -> System.out.println(month));
    }
}
