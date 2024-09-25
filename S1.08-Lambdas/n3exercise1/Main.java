package n3exercise1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
                new Student("John", 18, "Python", 4.5),
                new Student("Jane", 20, "Java", 5.5),
                new Student("Albert", 27, "Python", 8.0),
                new Student("Thomas", 23, "Java", 2.5),
                new Student("Alice", 24, "PHP", 9.0),
                new Student("Jenny", 24, "Python", 4.0),
                new Student("Marina", 25, "Javascript", 5.0),
                new Student("Elisa", 25, "Java", 7.0),
                new Student("Johanna", 26, "Javascript", 2.5),
                new Student("Bob", 18, "PHP", 5.0)
        ));

        System.out.println("Students: ");
        students.forEach(student -> System.out.println(student.getName() + " " + student.getAge()));
        System.out.println("Students with name starting with A: ");
        List<Student> namesStartingWithA = students.stream().filter(student -> student.getName().toLowerCase().startsWith("a")).toList();
        namesStartingWithA.forEach(System.out::println);
        System.out.println("Students with grade 5 or higher: ");
        students.stream().filter(student -> student.getGrade() >= 5).forEach(System.out::println);
        System.out.println("Students with grade 5 or higher and aren't in PHP: ");
        students.stream().filter(student -> student.getGrade() >=5 && !student.getCourse().equals("PHP")).forEach(System.out::println);
    }
}
