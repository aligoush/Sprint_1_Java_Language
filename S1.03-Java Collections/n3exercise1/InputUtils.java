package n3exercise1;

import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static String readInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static int readIntInput(String message) {
        System.out.println(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
}