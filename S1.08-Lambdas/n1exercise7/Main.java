package n1exercise7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Object> mixedList = new ArrayList<>();
        mixedList.add("apple");
        mixedList.add(103);
        mixedList.add("Odin");
        mixedList.add(5685);
        mixedList.add("kiwi");
        mixedList.add("watermelon");
        mixedList.stream()
                .map(item-> item.toString())
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);
    }
}
