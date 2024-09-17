package AssertJ.n2exercise6;

public class Main {

    public static void provokeArrayIndexOutOfBounds() {
        int[] numbers = {1, 2, 3, 10, 5};
        int invalidAccess = numbers[6];
    }
}
