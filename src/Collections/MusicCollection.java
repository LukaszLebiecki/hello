package Collections;

import java.util.List;

public class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );

        timeAllSongForCategory(songs, Song.Genre.POP);
        countSongsForArt(songs, "Metallica");
        System.out.println(">>>");
        List<Song> songList = allSongsForArt(songs, Song.Genre.METAL);
        songList.forEach(System.out::println);


    }

    public static void timeAllSongForCategory(List<Song> songs, Song.Genre genre) {
        int sum = songs.stream()
                .filter(s -> s.getGenre() == genre)
                .mapToInt(s -> s.getLength())
                .sum();
        System.out.println("Łączny czas piosenek popowych w playliscie (w sek): " + sum);
    }

    public static void countSongsForArt(List<Song> songs, String art) {
        long count = songs.stream()
                .filter(s -> s.getArtist().equals(art))
                .count();
        System.out.println("Liczba piosenek Metaliliki na playliscie: " + count);
    }

    public static List<Song> allSongsForArt(List<Song> songs, Song.Genre genre) {
        return songs.stream()
                .filter(s -> s.getGenre().equals(genre))
                .distinct()
                .toList();
    }

//    Metoda 1: filter(), mapToInt() i sum().
//metoda przyjmuje listę utworów i gatunek muzyczny, a zwraca łączny czas trwania wszystkich utworów danego gatunku,
// "Łączny czas piosenek popowych w playliscie (w sek): 652"

//    Metoda 2: filter(), count().
//metoda przyjmuje listę utworów i nazwę artysty, a zwraca liczbę utworów danego autora w tej liście,
// "Liczba piosenek Metaliliki na playliscie: 4"

//    Metoda 3: filter(), distinct(), collect().
// metoda przyjmuje listę utworów i gatunek muzyczny, a zwraca listę utworów bez utworów, które miały przypisany
// ten gatunek muzyczny oraz bez duplikatów (powtarzających się utworów).

}
