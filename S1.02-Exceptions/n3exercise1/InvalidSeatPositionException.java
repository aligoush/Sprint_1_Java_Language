package n3exercise1;

public class InvalidSeatPositionException extends Exception{
    public InvalidSeatPositionException(){
        super("There is no such seat");
    }
}
