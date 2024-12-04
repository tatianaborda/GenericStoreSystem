package store;
import java.util.HashMap;
import java.util.Map;

public class Storage<K, V> {
    private Map<K, V> items; // Almacén como un mapa clave-valor

    public Storage() {
        items = new HashMap<>();
    }

    // Agregar un elemento con clave y valor
    public void addItem(K key, V value) {
        items.put(key, value);
    }

    // Eliminar un elemento por su clave
    public void removeItem(K key) {
        items.remove(key);
    }

    // Obtener un elemento por su clave
    public V getItem(K key) {
        return items.get(key);
    }

    // Mostrar todos los elementos del almacén
    public void showAll() {
        System.out.println("Elementos en el almacén: " + items.values());
    }

    // Obtener el mapa interno (útil para otros métodos)
    public Map<K, V> getItems() {
        return items;
    }
}
