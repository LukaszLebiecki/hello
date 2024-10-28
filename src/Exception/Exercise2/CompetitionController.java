package Exception.Exercise2;

import java.util.Scanner;

public class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run() {
        try {
            Competition competition = createCompetition();
            fillParticipantsInfo(competition);
            printCompetition(competition);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private Competition createCompetition() {
        System.out.print("Podaj nazwę zawodów: ");
        String competitionName = scanner.nextLine();
        System.out.print("Podaj maksymalną liczbę uczestników: ");
        int maxParticipants = scanner.nextInt();
        System.out.print("Podaj ograniczenie wiekowe: ");
        int ageLimit = scanner.nextInt();
        scanner.nextLine();
        if (maxParticipants <= 0 || ageLimit <= 0)
            throw new IllegalArgumentException("Dane nie mogą być ujemne");
        return new Competition(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            System.out.println("Dodaj nowego uczestnika");
            try {
                Participant participant = createParticipant();
                competition.addParticipant(participant);
            } catch (AgeViolationException | DuplicateException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private Participant createParticipant() {
        System.out.print("Podaj imię: ");
        String firstName = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.print("Podaj id (np. pesel): ");
        String id = scanner.nextLine();
        System.out.print("Podaj wiek: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age <= 0) {
            throw new IllegalArgumentException("Wiek nie może być ujemny");
        }
        return new Participant(firstName, lastName, id, age);
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }
}
