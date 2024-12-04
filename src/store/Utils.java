package store;
import java.util.List;

public class Utils {
    public static <K, V> int getTotalItems(List<Storage<?, ?>> storages) {
        int total = 0;
        for (Storage<?, ?> storage : storages) {
            total += storage.getItems().size();
        }
        return total;
    }

    // Mostrar elementos de cualquier tipo usando wildcards
    public static void showItems(List<?> items) {
        System.out.println("Elementos: " + items);
    }
}

