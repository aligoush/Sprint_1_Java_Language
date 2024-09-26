package n3exercise1;

public class SeatOccupiedException extends Exception {
    public SeatOccupiedException() {
        super("The seat is already occupied.");
    }
}
