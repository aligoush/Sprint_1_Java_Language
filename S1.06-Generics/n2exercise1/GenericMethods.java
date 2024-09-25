package n2exercise1;

public class GenericMethods {

    public static <T1, T2, T3> void printArguments(T1 arg1, T2 arg2, String arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
    }

    public static void main(String[] args) {
        //printArguments("Hello, World", new Person("John", "Doe", 30), true);
        //printArguments(true, "Hello, World", new Person("John", "Doe", 30));
        printArguments(new Person("John", "Doe", 30), true, "Hello, World");
    }
}
