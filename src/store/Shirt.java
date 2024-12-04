package store;

public class Shirt {
    private int id;
    private String size;

    public Shirt(int id, String size) {
        this.id = id;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Remera{id=" + id + ", talla='" + size + "'}";
    }
}
