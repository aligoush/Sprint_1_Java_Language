package n2exercise2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(57);
        list.add(44);
        list.add(358);
        list.stream().map(num -> num % 2 == 0 ? "e" + num : "o" + num).forEach(System.out::println);
    }
}
