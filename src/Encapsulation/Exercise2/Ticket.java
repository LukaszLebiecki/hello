package Encapsulation.Exercise2;

public class Ticket {
    private int id;
    private Film movie;
    private Client client;

    public Ticket(int id, Film movie, Client client) {
        this.id = id;
        this.movie = movie;
        this.client = client;
    }

    public String getInfo() {
        return id + " | " + movie.getMovieInfo() + " | " + client.getFullName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Film getMovie() {
        return movie;
    }

    public void setMovie(Film movie) {
        this.movie = movie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
