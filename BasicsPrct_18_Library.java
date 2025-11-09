import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Book {

    private String bookName;
    private String bookAuthor;

    public Book(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;

    }

    public String bookName() {
        return bookName;
    }

    public String bookAuthor() {
        return bookAuthor;
    }

    @Override
    public String toString() {
        return "Book Name: " + bookName + ", Author: " + bookAuthor ;
    }


}

public class BasicsPrct_18_Library {

    // Create a Library class with a list of Book objects. Add methods to add a book, remove a book, and display all books. //

    private String name;
    private List<Book> books;

    public BasicsPrct_18_Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public void printAllBookDetails() {
        System.out.println("Books in " + this.name + ":");
        if (books.isEmpty()) {
            System.out.println("No Books in the Library.");
        } else {
            for (Book book : books) {
                //System.out.println(car.toString());
                System.out.println(book);
            }
        }
    }


    public static void main (String[] args) {

        Book book1 = new Book("Animal Farm", "George Orwell");
        Book book2 = new Book("Gitanjali", "Rabindranath Tagore");
        Book book3 = new Book("The Merchant of Venice", "William Shakespeare");

        // Create a Garage object
        BasicsPrct_18_Library lib = new BasicsPrct_18_Library("Houston Public Library");

        // Add cars to the garage
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        // Print details of all cars in the garage
        lib.printAllBookDetails();

        System.out.println("\nRemoving Book...");
        lib.removeBook(book2);

        // Print details again after removal
        lib.printAllBookDetails();

    }

}
