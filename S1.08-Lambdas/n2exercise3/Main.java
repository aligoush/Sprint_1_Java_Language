package n2exercise3;

public class Main {
    public static void main(String[] args) {
        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> b == 0 ? 0: a / b;
        System.out.println("27 + 3 = " + addition.operate(27, 3));
        System.out.println("27 - 3 = " + subtraction.operate(27, 3));
        System.out.println("27 * 3 = " + multiplication.operate(27, 3));
        System.out.println("27 / 3 = " + division.operate(27, 3));
    }
}
