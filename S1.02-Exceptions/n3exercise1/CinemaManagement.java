package n3exercise1;

import java.util.Scanner;

public class CinemaManagement {
    private Cinema cinema;
    Scanner scanner;

    public CinemaManagement(Cinema cinema) {
        this.cinema = cinema;
        scanner = new Scanner(System.in);
    }

    public void menu() throws SeatEmptyException {
        int option = -1;
        while (option != 0) {
            System.out.println("1.- Show all reserved seats.");
            System.out.println("2.- Show seats reserved by a person.");
            System.out.println("3.- Reserve a seat.");
            System.out.println("4.- Cancel a seat reservation.");
            System.out.println("5.- Cancel all reservations for a person.");
            System.out.println("0.- Exit.");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    showSeats();
                    break;
                case 2:
                    showSeatsByPerson();
                    break;
                case 3:
                    reserveSeat();
                    break;
                case 4:
                    cancelReservation();
                    break;
                case 5:
                    cancelAllReservations();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public void showSeats(){
        for(Seat seat: cinema.getSeatManagement().getSeats()){
            System.out.println(seat);
        }
    }

    public void showSeatsByPerson(){
        System.out.println("Enter the name of the person: ");
        String person = scanner.next();
        for(Seat seat: cinema.getSeatManagement().getSeats()){
            if(seat.getPerson().equals(person)){
                System.out.println(seat);
            }
        }
    }

    public void reserveSeat(){
        System.out.println("Enter row, seat and person: ");
        int row = scanner.nextInt();
        int seatNumber = scanner.nextInt();
        String person = scanner.next();
        try {
            cinema.getSeatManagement().addSeat(new Seat(row, seatNumber, person));
            System.out.println("Seat successfully reserved.");
        } catch (SeatOccupiedException e) {
            System.out.println("The seat is already occupied.");
        }
    }

    public void cancelReservation() throws SeatEmptyException {
        System.out.println("Enter row and seat: ");
        int row = scanner.nextInt();
        int seatNumber = scanner.nextInt();
        cinema.getSeatManagement().removeSeat(row, seatNumber);
        System.out.println("Reservation successfully cancelled.");
    }

    public void cancelAllReservations(){
        System.out.println("Enter the name of the person: ");
        String person = scanner.next();
        cinema.getSeatManagement().getSeats().removeIf(seat -> seat.getPerson().equals(person));
        System.out.println("All reservations by " + person + " have been canceled.");
    }
}
