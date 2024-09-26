package n3exercise1;

import java.util.Scanner;

public class Cinema {
    private int rows;
    private int seatsPerRow;
    private SeatManagement seatManagement;
    private CinemaManagement cinemaManagement;

    public Cinema() {
        this.seatManagement = new SeatManagement();
        this.cinemaManagement = new CinemaManagement(this);
        askForCinemaDetails();
    }

    public void start() throws SeatEmptyException {
        cinemaManagement.menu();
    }

    public void askForCinemaDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of seats per row: ");
        seatsPerRow = scanner.nextInt();
    }

    public SeatManagement getSeatManagement() {
        return seatManagement;
    }
}
