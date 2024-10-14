package Encapsulation.Exercise2;

public class CinemaSystem {
    public static void main(String[] args) {

        Film film = new Film("Omen", "horror", 128, 16, 72, 72);
        Client client1 = new Client("Jan", "Kowalski", 15);
        TicketSystem ticketSystem = new TicketSystem();
        Ticket ticket1 = ticketSystem.createTicket(film, client1);

        Client client2 = new Client("Anna", "Zalewska", 19);
        Ticket ticket2 = ticketSystem.createTicket(film, client2);

        System.out.println("Sprzedane bilety");
        if (ticket1 != null) {
            System.out.println(ticket1.getInfo());
        }
        if (ticket2 != null) {
            System.out.println(ticket2.getInfo());
        }


        System.out.println("Liczba pozostałych miejsc: " + film.freeSeats);
        System.out.println("Liczba sprzedanych biletów: " + (film.maxSeats - film.freeSeats));
    }
}
