package n3exercise1;

import java.util.ArrayList;

public class SeatManagement {
    private ArrayList<Seat> seats;

    public SeatManagement() {
        this.seats = new ArrayList<>();
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void addSeat(Seat seat) throws SeatOccupiedException {
        if(findSeat(seat.getRow(), seat.getSeat())!=-1) {
            throw new SeatOccupiedException();
        }
        seats.add(seat);
    }

    public int findSeat(int row, int seatNumber) {
        for(int i = 0; i < seats.size(); i++) {
            if(seats.get(i).getRow() == row && seats.get(i).getSeat() == seatNumber) {
                return i;
            }
        }
        return -1;
    }

    public void removeSeat(int row, int seatNumber) throws SeatEmptyException {
        int indexSeatToRemove = findSeat(row, seatNumber);
        if(indexSeatToRemove == -1) {
            throw new SeatEmptyException();
        }
        seats.remove(indexSeatToRemove);
    }
}
