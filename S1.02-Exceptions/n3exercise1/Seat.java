package n3exercise1;

public class Seat {
    private final int row;
    private final int seatNumber;
    private final String person;

    public Seat(int row, int seat, String person) {
        this.row = row;
        this.seatNumber = seat;
        this.person = person;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seatNumber;
    }

    public String getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return row == seat.row && seatNumber == seat.seatNumber;
    }

    @Override
    public String toString() {
        return "Row: " + row + ", Seat: " + seatNumber + ", Person: " + person;
    }
}
