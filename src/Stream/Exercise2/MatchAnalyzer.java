package Stream.Exercise2;

import java.util.Arrays;
import java.util.stream.Stream;

public class MatchAnalyzer {
    public static void main(String[] args) {

        showAllMatch(createStream());
        System.out.println("Wszystkie spotkania Polski:");
        showMatchTeam(createStream(), "Polska");
        countTeam(createStream());
        sumGoal(createStream());

    }

    private static void sumGoal(Stream<MatchResult> stream) {
        int sum = stream.mapToInt(MatchResult::getGoalSum)
                .sum();
        System.out.println("Łączna liczba goli: " + sum);
    }

    private static void countTeam(Stream<MatchResult> stream) {
        long count = stream.map(n -> new String[]{n.getHost(), n.getGuest()})
                .flatMap(Arrays::stream)
                .distinct()
                .count();
        System.out.println("Liczba drużyn biorących udział w rogrywkach: " + count);
        System.out.println(">>>");
    }

    private static Stream<MatchResult> createStream() {
        Stream<MatchResult> results = Stream.of(
                new MatchResult("Polska", "Irlandia", 2, 0),
                new MatchResult("Brazylia", "Francja", 0, 3),
                new MatchResult("Włochy", "Polska", 2, 1),
                new MatchResult("Brazylia", "Argentyna", 2, 2),
                new MatchResult("Anglia", "Niemcy", 1, 2),
                new MatchResult("Anglia", "Francja", 3, 0),
                new MatchResult("Polska", "Portugalia", 1, 0),
                new MatchResult("Brazylia", "Niemcy", 3, 3)
        );
        return results;
    }

    private static void showMatchTeam(Stream<MatchResult> results, String team) {
        results.filter(n -> n.getHost().equals(team) || n.getGuest().equals(team))
                .forEach(System.out::println);
        System.out.println(">>>");

    }

    private static void showAllMatch(Stream<MatchResult> results) {
        System.out.println("Wszystkie mecze:");
        results.sorted((m1, m2) -> {
                    int result1Difference = m1.getHostGoals() - m1.getGuestGoals();
                    int result2Difference = m2.getHostGoals() - m2.getGuestGoals();
                    return Integer.compare(result1Difference, result2Difference);
                })
                .forEach(System.out::println);
        System.out.println(">>>");
    }
}
