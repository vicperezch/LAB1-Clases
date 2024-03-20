/**
 * @author Victor Pérez
 * @since 20/03/2024
 * Clase que modela un libro de la tienda
 */
public class Book {
    private String title;
    private String author;
    private int year;
    private String genre;
    private String isbn;
    private double price;

    /**
     * Constructor por defecto
     */
    public Book() {
        this.title = "";
        this.author = "";
        this.year = 0;
        this.isbn = "";
        this.price = 0.0;
    }


    /**
     * Constructor con parámetros
     * @param title Título del libro
     * @param author Autor del libro
     * @param year Año de publicación
     * @param isbn ISBN del libro
     * @param price Precio del libro
     */
    public Book(String title, String author, int year, String genre, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.isbn = isbn;
        this.price = price;
    }


    // Setters y getters
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public String getGenre() {
        return genre;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    
    /**
     * Muestra la información del libro
     * @return String con los detalles del libro
     */
    public String showDetails() {
        return "Título: " + title + "\nAutor: " + author + "\nAño: " + year + "\nGénero: " + genre + "\nISBN: " + isbn + "\nPrecio: $" + price;
    }
}
