package store;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear almacenes
        Storage<Integer, Book> bookStorage = new Storage<>();
        Storage<Integer, Disk> diskStorage = new Storage<>();
        Storage<Integer, Shirt> shirtStorage = new Storage<>();

        // Agregar libros
        bookStorage.addItem(1, new Book(1, "1984"));
        bookStorage.addItem(2, new Book(2, "El Principito"));

        // Agregar discos
        diskStorage.addItem(1, new Disk(1, "Thriller"));
        diskStorage.addItem(2, new Disk(2, "Back in Black"));

        // Agregar remeras
        shirtStorage.addItem(1, new Shirt(1, "M"));
        shirtStorage.addItem(2, new Shirt(2, "L"));

        // Mostrar elementos de cada almacén
        System.out.println("Almacén de Libros:");
        bookStorage.showAll();

        System.out.println("Almacén de Discos:");
        diskStorage.showAll();

        System.out.println("Almacén de Remeras:");
        shirtStorage.showAll();

        // Buscar elementos por su clave
        System.out.println("Buscando el libro con id 2: " + bookStorage.getItem(2));
        System.out.println("Buscando el disco con id 1: " + diskStorage.getItem(1));

        // Calcular total de elementos en todos los almacenes
        List<Storage<?, ?>> allStorages = new ArrayList<>();
        allStorages.add(bookStorage);
        allStorages.add(diskStorage);
        allStorages.add(shirtStorage);

        int totalItems = Utils.getTotalItems(allStorages);
        System.out.println("Total de elementos en todos los almacenes: " + totalItems);
    }
}
