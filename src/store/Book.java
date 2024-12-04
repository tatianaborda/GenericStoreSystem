package store;

public class Book {
    private int id;
    private String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Libro{id=" + id + ", título='" + title + "'}";
    }
}

