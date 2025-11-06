import java.util.Scanner;

public class BasicsPrct_11_Author {

    // Create a class Author and another class Book. A Book should have an Author (object of Author class). Display book and author details together. //

    String author;

    void displayInfo(){

        System.out.println("Author: " + author);

    }


    public static void main (String[] args) {

     BasicsPrct_11_Author author = new BasicsPrct_11_Author();
     BasicsPrct_11_Book book = new BasicsPrct_11_Book();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Book details");
     System.out.println("Name : ");
     book.bookName = sc.nextLine();
     System.out.println("Author : ");
     author.author = sc.nextLine();
     book.displayInfo();
     author.displayInfo();


    }

}
