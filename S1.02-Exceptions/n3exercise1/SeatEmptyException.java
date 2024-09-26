package n3exercise1;

public class SeatEmptyException extends Exception {
    public SeatEmptyException() {
        super("The seat is empty.");
    }
}
