import java.util.Scanner;

public class RemoveWhiteSpaces {

    //remove all whitespaces from a string

    public static void main (String [] args) {

        String Str;
        int count = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        Str = sc.nextLine();

        System.out.println("Entered String: " + Str);

        Str = Str.replaceAll("\\s","");

        System.out.println("Result String: " + Str);

    }
}
