package n2exercise2;

public class GenericMethods {

    public static <T> void printArguments(T...args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println("Argument "+ (i+1) + ": " + args[i]);
        }
    }

    public static void main(String[] args) {
        printArguments("Hello, World", new Person("John", "Doe", 30), true);
        printArguments(true, "Hello, World", new Person("John", "Doe", 30));
        printArguments(new Person("John", "Doe", 30), true, "Hello, World");
    }
}
