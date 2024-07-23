package n1exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> monthsList = new ArrayList<>();
        Month jan = new Month("January");
        Month feb = new Month("February");
        Month mar = new Month("March");
        Month apr = new Month("April");
        Month may = new Month("May");
        Month jun = new Month("June");
        Month jul = new Month("July");
        Month sep = new Month("September");
        Month oct = new Month("October");
        Month nov = new Month("November");
        Month dec = new Month("December");
        Month aug = new Month("August");
        monthsList.add(jan);
        monthsList.add(feb);
        monthsList.add(mar);
        monthsList.add(apr);
        monthsList.add(may);
        monthsList.add(jun);
        monthsList.add(jul);
        monthsList.add(sep);
        monthsList.add(oct);
        monthsList.add(nov);
        monthsList.add(dec);
        monthsList.add(7,aug);

        for (Month value : monthsList) {
            System.out.println(value.getName());
        }
        System.out.println("Again adding the August object to the list");
        monthsList.add(aug);

        for (Month value : monthsList) {
            if (value.equals(aug)) {
                System.out.println("The objects August are the same.");

            }
            System.out.println("Month: " + value.getName());
        }

        HashSet<Month> monthsSet = new HashSet<>();

        for (Month value : monthsList) {
            monthsSet.add(value);
        }


        System.out.println("Checking if the object August is the same");

        if(monthsSet.contains(aug)){
            for (Month month: monthsSet) {
                if(month.equals(aug)){
                    System.out.println("Object August exists");
                }
            }
        }

        System.out.println("Adding repeated object August to the set");
        monthsSet.add(aug);

        Iterator<Month> it = monthsSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }
    }
}
