/**
 * @author Victor Pérez
 * @since 20/03/2024
 * Clase principal donde se desarrolla el programa
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("El Señor de los Anillos", "J. R. R. Tolkien", 1954, "Fantasía", "978-84-450-0770-9", 10.50);

        System.out.println("--- Detalles del libro 2 ---");
        System.out.println(book2.showDetails() + "\n");

        book2.setPrice(15.00);

        System.out.println("--- Detalles actualizados del libro 2 ---");
        System.out.println(book2.showDetails() + "\n");
    }
}