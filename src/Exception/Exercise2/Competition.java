package Exception.Exercise2;

public class Competition {
    private String name;
    private Participant[] participants;
    private int ageLimit;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        this.ageLimit = ageLimit;
        this.participants = new Participant[maxParticipants];
    }

    void addParticipant(Participant participant) {
        if (participant.getAge() < ageLimit) {
            throw new AgeViolationException("Uczestnik nie spełnia limitu wiekowego");
        }
        if (!hasFreeSpots()) {
            throw new MaxCompetitorsException("Osiągnięto limit uczestników");
        }
        if (changeDuplicate(participant)) {
            throw new DuplicateException("Już podany uczestnik jest zapisany");
        }
        participants[size] = participant;
        size++;
    }

    private boolean changeDuplicate(Participant participant) {
        for (int i = 0; i < size; i++) {
            Participant participantRegistered = participants[i];
            if (participantRegistered.getDocumentId().equals(participant.getDocumentId()))
                return true;
        }
        return false;
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}
