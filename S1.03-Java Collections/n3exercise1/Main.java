package n3exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Person> people = new ArrayList<>();
        File myFile = new File(
                "S1.03-Java Collections/n3exercise1/people.csv");
        int input;
        Main.readFile(myFile, people);
        do{
            System.out.println();
            System.out.println("1) Insert the user");
            System.out.println("2) Show sorted people by name [A-Z]");
            System.out.println("3) Show sorted people by name [Z-A]");
            System.out.println("4) Show sorted people by surname [A-Z]");
            System.out.println("5) Show sorted people by surname [Z-A]");
            System.out.println("6) Show sorted people by DNI [1-9]");
            System.out.println("7) Show sorted people by surname [9-1]");
            System.out.println("8) Quit");

            input = InputUtils.readIntInput("Choose an option: ");
            switch (input) {
                case 1: Main.writeToFile(myFile, people);
                    break;
                case 2:
                    Collections.sort(people, Comparator.comparing(Person::getName));
                    Main.showList(people);
                    break;
                case 3:
                    Collections.sort(people, Comparator.comparing(Person::getName).reversed());
                    Main.showList(people);
                    break;
                case 4:
                    Collections.sort(people, Comparator.comparing(Person::getSurname));
                    Main.showList(people);
                    break;
                case 5:
                    Collections.sort(people, Comparator.comparing(Person::getSurname).reversed());
                    Main.showList(people);
                    break;
                case 6:
                    Collections.sort(people, Comparator.comparing(Person::getDNI));
                    Main.showList(people);
                    break;
                case 7:
                    Collections.sort(people, Comparator.comparing(Person::getDNI).reversed());
                    Main.showList(people);
                    break;
                case 8:
                    System.out.println("Finishing the program...");
                    break;
                default:
                    System.out.println("Numbers from 1 to 8");
            }
        } while(input != 8);
    }
    public static void readFile (File myFile, ArrayList<Person> people) throws FileNotFoundException {
        if (!myFile.exists()) {
            throw new FileNotFoundException();
        }
        Scanner sc = new Scanner(myFile);
        while (sc.hasNextLine()) {
            String regex = "\\s{3,}";
            String line = sc.nextLine();
            String[] data = Pattern.compile(regex).split(line);
            if (data.length == 3) {
                people.add(new Person(data[0], data[1], data[2]));
            }
        }
    }
    public static void writeToFile (File myFile, ArrayList<Person> people) throws FileNotFoundException {
        if (!myFile.exists()) {
            throw new FileNotFoundException();
        }
        String data = "\n";
        String name = InputUtils.readInput("Insert the name: ");
        String surname= InputUtils.readInput("Insert the surname: ");
        String DNI = InputUtils.readInput("Insert the DNI: ");
        people.add(new Person(name, surname, DNI));
        data += name + "          " + surname + "          " + DNI;
        try {
            Files.writeString(myFile.toPath(), data, StandardOpenOption.APPEND);
            String fileContent = Files.readString(myFile.toPath());
            System.out.println(fileContent);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

    }
    public static void showList (ArrayList<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
