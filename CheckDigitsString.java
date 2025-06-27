import java.util.Scanner;

public class CheckDigitsString {

    //check if a string contains only digit

        public static boolean checkDigits(String s) {
            StringBuilder sb = new StringBuilder(s.length());

            // Traverse through all characters
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                // Check if s[i] is present before it
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        }

    public static void main (String [] args) {

        String Str;
       // int count = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        Str = sc.nextLine();

        System.out.println("Entered String: " + Str);
        Str = Str.toLowerCase();

        if(checkDigits(Str)){
            System.out.println("Entered String contains only digit.");
        }
        else{
            System.out.println("Entered String does not contains only digit.");
        }

    }
}
