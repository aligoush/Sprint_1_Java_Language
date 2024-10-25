package n3exercise1;

import java.util.InputMismatchException;
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

    public int getRows() {
        return rows;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public void askForCinemaDetails() {
        Scanner scanner = new Scanner(System.in);
        do {
            try{
                System.out.print("Enter the number of rows: ");
                rows = scanner.nextInt();
                System.out.print("Enter the number of seats per row: ");
                seatsPerRow = scanner.nextInt();
            } catch (Exception e){
                System.out.println("The rows and seats should be integer numbers");
                scanner.nextLine();
            }
        } while (rows != (int)rows || rows <= 0 || seatsPerRow != (int)seatsPerRow || seatsPerRow <= 0);
    }

    public SeatManagement getSeatManagement() {
        return seatManagement;
    }
}
