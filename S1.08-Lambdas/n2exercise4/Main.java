package n2exercise4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Object> mixedList = new ArrayList<>();
        Collections.addAll(mixedList, "Sahara","elton",234,"France","hello","Malaga", 3243, 55);

        System.out.println("Sorted alphabetically:");
        mixedList.sort(Comparator.comparing(Object::toString));
        System.out.println(mixedList);

        //____________________________
        System.out.println("Sorted by containing 'e' first:");
        Map<Boolean, List<Object>> partitionedMap = mixedList.stream().collect(Collectors.partitioningBy(item -> item.toString().contains("e")));
        ArrayList<Object> listWithE = (ArrayList<Object>) partitionedMap.get(true);
        ArrayList<Object> listWithoutE = (ArrayList<Object>) partitionedMap.get(false);
        ArrayList<String> listOrderedE = new ArrayList<>();
        listOrderedE.addAll(listWithE.stream().map(obj -> obj.toString()).toList());
        listOrderedE.addAll(listWithoutE.stream().map(obj -> obj.toString()).toList());
        listOrderedE.forEach(System.out::println);

        //____________________________
        System.out.println("Changed all 'a' to '4':");
        mixedList.stream().map(item -> item.toString().replace("a", "4")).forEach(System.out::println);

        //____________________________
        System.out.println("Only numbers:");
        mixedList.stream().filter(item -> item instanceof Integer || isNumeric(item)).forEach(System.out::println);
    }
    public static boolean isNumeric(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Integer.parseInt(obj.toString());
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
