package store;
import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private List<T> items; // Lista interna para almacenar elementos

    public Storage() {
        items = new ArrayList<>();
    }

    // Agregar un elemento al almacén
    public void addItem(T item) {
        items.add(item);
    }

    // Eliminar un elemento del almacén
    public void removeItem(T item) {
        items.remove(item);
    }

    // Obtener todos los elementos
    public List<T> getItems() {
        return items;
    }

    // Mostrar todos los elementos
    public void showAll() {
        System.out.println("Elementos en el almacén: " + items);
    }
}
