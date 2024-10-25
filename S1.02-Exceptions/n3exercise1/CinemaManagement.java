package n3exercise1;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CinemaManagement {
    private Cinema cinema;
    Scanner scanner;

    public CinemaManagement(Cinema cinema) {
        this.cinema = cinema;
        scanner = new Scanner(System.in);
    }

    public void menu(){
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
        if(!cinema.getSeatManagement().getSeats().isEmpty()){
            for(Seat seat: cinema.getSeatManagement().getSeats()){
                System.out.println(seat);
            }
        } else {
            System.out.println("There are no reservations found");
        }
    }

    public void showSeatsByPerson(){
        System.out.println("Enter the name of the person: ");
        String person = scanner.next();
        ArrayList<Seat> seatsReservedByPerson = (ArrayList<Seat>) cinema.getSeatManagement().getSeats().stream().filter(seat -> seat.getPerson().equals(person)).collect(Collectors.toList());
        if(!seatsReservedByPerson.isEmpty()){
            System.out.println("The seats reserved by " + person + " are: " + seatsReservedByPerson);
        } else {
            System.out.println("No reservations found for the that person");
        }
    }

    public void reserveSeat(){
        System.out.println("Enter row, seat and person: ");
        int row = scanner.nextInt();
        int seatNumber = scanner.nextInt();
        scanner.nextLine();
        String person = scanner.nextLine();
        try {
            cinema.getSeatManagement().addSeat(cinema, new Seat(row, seatNumber, person));
            System.out.println("Seat successfully reserved.");
        } catch (SeatOccupiedException | InvalidSeatPositionException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelReservation() {
        System.out.println("Enter row and seat: ");
        int row = scanner.nextInt();
        int seatNumber = scanner.nextInt();
        try{
            cinema.getSeatManagement().removeSeat(row, seatNumber);
            System.out.println("Reservation successfully cancelled.");
        } catch(SeatEmptyException e){
            System.out.println(e.getMessage());
        }
    }

    public void cancelAllReservations(){
        System.out.println("Enter the name of the person: ");
        String person = scanner.nextLine();
        boolean removed = cinema.getSeatManagement().getSeats().removeIf(seat -> seat.getPerson().equals(person));
        if(removed){
            System.out.println("All reservations by " + person + " have been canceled.");
        } else {
            System.out.println("No reservations found for the specified person.");
        }
    }
}
