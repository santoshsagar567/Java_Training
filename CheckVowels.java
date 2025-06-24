import java.util.Scanner;

public class CheckVowels {

    public static void main (String [] args){

        String Str;
        int vowelcount = 0; int conscount = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        Str = sc.nextLine();

        System.out.println("Entered String: "+Str);

        for(int i = 0; i <Str.length(); i++) {
            if (Str.charAt(i) == 'a' || Str.charAt(i) == 'A' || Str.charAt(i) == 'e' || Str.charAt(i) == 'E' || Str.charAt(i) == 'i'
                    || Str.charAt(i) == 'I' || Str.charAt(i) == 'o' || Str.charAt(i) == 'O' || Str.charAt(i) == 'u' || Str.charAt(i) == 'U')
            {
                vowelcount = vowelcount + 1;
            }
            else{
                conscount = conscount + 1;
            }
        }

        System.out.println("Count of Vowels: "+vowelcount);
        System.out.println("Count of Consonants: "+conscount);

    }
}
