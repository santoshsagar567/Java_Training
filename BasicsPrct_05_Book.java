
public class BasicsPrct_05_Book {

    // Create a class Book with attributes title, author, and price. Use a constructor to initialize values and display them. //

    String title;
    String author;
    int price;

    //non parameterised constructor
    BasicsPrct_05_Book(){
        title = "Alice in Wonderland";
        author = "Lewis Carroll";
        price = 1200;
    }

    void getBookDetails(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }


    public static void main (String[] args) {

     BasicsPrct_05_Book book = new BasicsPrct_05_Book();
     book.getBookDetails();

    }

}
