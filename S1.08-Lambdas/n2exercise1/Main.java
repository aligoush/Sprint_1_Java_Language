package n2exercise1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Ace");
        nameList.add("Abel");
        nameList.add("Odin");
        nameList.add("Iris");
        nameList.add("Ali");
        nameList.add("Walter");
        nameList.stream().filter(name-> name.startsWith("A") && name.length()==3).forEach(System.out::println);
    }
}
