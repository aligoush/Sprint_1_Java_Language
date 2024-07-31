package n1exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        for(int i=0; i<10; i++){
            list.add(((int)(Math.random()*range) + min));
            System.out.println(list.get(i));
        }
        List<Integer> listInverse = new ArrayList<>();
        ListIterator<Integer> intIterator = list.listIterator(list.size());

        while (intIterator.hasPrevious()) {
            int value = intIterator.previous();
            listInverse.add(value);
        }
        for (Integer item: listInverse) {
            System.out.println(item);
        }
    }
}
