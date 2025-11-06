import java.util.Scanner;

public class BasicsPrct_10_Movie {

    // Create a Movie class with title, rating, and duration. Add a method to check if it’s a “hit” or “flop” based on rating. //

    String title;
    float rating;
    float duration;

    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + duration);
    }

    void  checkRating(){
        if(rating >= 8.5){
            System.out.println("Movie is a Hit!");
        }
        else{
            System.out.println("Movie is a Flop!");
        }

    }



    public static void main (String[] args) {

     BasicsPrct_10_Movie movie = new BasicsPrct_10_Movie();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the movie details to check if it’s a “hit” or “flop”");
     System.out.println("Enter the Title: ");
     movie.title = sc.nextLine();
     System.out.println("Enter the Ratings out of 10: ");
     movie.rating = sc.nextFloat();
     System.out.println("Enter the Duration in hours: ");
     movie.duration = sc.nextFloat();
     movie.displayInfo();
     movie.checkRating();


    }

}
