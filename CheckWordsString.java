import java.util.Scanner;

public class CheckWordsString {

    //remove all whitespaces from a string

    public static void main (String [] args) {

        String Str;
        int wordCount = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        Str = sc.nextLine();

        System.out.println("Entered String: " + Str);

        wordCount = Str.split("\\s").length;

        System.out.println("No. of Words: " + wordCount);

    }
}
