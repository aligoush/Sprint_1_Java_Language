package n1exercise2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("java");
        strings.add("Ok");
        strings.add("Open source");
        strings.add("origami");
        ArrayList<String> result = strings.stream().filter(word -> word.toLowerCase().contains("o")&& word.length() > 5).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Strings containing 'o' and longer than 5: " + result);
    }
}
