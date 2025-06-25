import java.util.Locale;
import java.util.Scanner;

public class CheckFrequencyofChar {

    public static void main (String [] args){

        String Str;
        int count = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        Str = sc.nextLine();

        System.out.println("Entered String: "+Str);
        Str = Str.toLowerCase();
        for(int i = 0; i <Str.length(); i++) {
            char c = Str.charAt(i);
            int m = Str.indexOf(c);
            for (int j = m+1; j<Str.length(); j++) {
                if (c == Str.charAt(j)){
                    count = count +1;
                }
                else {
                    continue;
                }
            }
            System.out.println("Count of "+Str.charAt(i)+" : " +count);
            count = 1;
        }

        //System.out.println("Count of Vowels: "+count);

    }
}
