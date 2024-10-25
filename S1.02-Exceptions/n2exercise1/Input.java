package n2exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Input {
    static Scanner scanner = new Scanner(System.in);
    public static byte readByte(String message){
        byte number = 0;
        boolean validInput = false;
        do {
            try {
                System.out.println(message);
                number = scanner.nextByte();
            } catch (InputMismatchException e){
                System.err.println("Age should be numerical");
                scanner.nextLine();
            }
        } while (!validInput);
        return number;
    }

    public static int readInt(String message){
        int input = 0;
        boolean validInput = false;
        do{
            try {
                System.out.println(message);
                input = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e){
                System.err.println("The number should be an integer");
                scanner.next();
            }
        } while (!validInput);
        return input;
    }

    public static float readFloat(String message){
        float input = 0;
        boolean validInput = false;
        do{
            try {
                System.out.println(message);
                input = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e){
                System.err.println("The number should be numerical");
                scanner.next();
            }
        } while (!validInput);
        return input;
    }

    public static double readDouble(String message){
        double input = 0;
        boolean validInput = false;
        do{
            try {
                System.out.println(message);
                input = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e){
                System.err.println("The number should be numerical");
                scanner.next();
            }
        } while (!validInput);
        return input;
    }

    public static char readChar(String message){
        char input = 0;
        boolean validInput = false;
        do{
            try {
                System.out.println(message);
                input = scanner.next().charAt(0);
                validInput = true;
            } catch (Exception e){
                System.err.println("It should be a character");
                scanner.next();
            }
        } while (!validInput);
        return input;
    }

    public static String readString(String message){
        String input = "";
        boolean validInput = false;
        do{
            try {
                System.out.println(message);
                input = scanner.next();
                validInput = true;
            } catch (IllegalStateException e){
                System.err.println("The error occured.");
                System.out.println("Details of the exception: " + e.getMessage());
                scanner.next();
            }
        } while (!validInput);
        return input;
    }

    public static Boolean readYesNo(String message){
        char input;
        boolean result = true;
        boolean validInput = false;
        do{
            try {
                System.out.println(message);
                input = scanner.next().charAt(0);
                if(input == 'y'){
                    result = true;
                    validInput = true;
                } else if (input == 'n') {
                    result = false;
                    validInput = true;
                }
            } catch (Exception e){
                System.err.println("The input should be 'y' or 'n' characters");
                scanner.next();
            }
        } while (!validInput);
        return result;
    }
}
