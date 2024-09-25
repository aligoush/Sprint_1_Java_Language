package n1exercise5;

public class Main {
    public static void main(String[] args) {
        PiValue numberPi = () -> 3.1415;
        System.out.println(numberPi.getPiValue());
    }
}
