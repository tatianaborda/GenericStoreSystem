package store;

public class Disk {
    private int id;
    private String album;

    public Disk(int id, String album) {
        this.id = id;
        this.album = album;
    }

    @Override
    public String toString() {
        return "Disco{id=" + id + ", álbum='" + album + "'}";
    }
}
