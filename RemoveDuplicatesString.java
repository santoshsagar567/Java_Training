import java.util.Scanner;

public class RemoveDuplicatesString {

    //remove duplicate chars from a string
    public static String removeDuplicate(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        boolean[] seen = new boolean[256];

        // Traverse through all characters
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check if s[i] is present before it
            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }

        return sb.toString();
    }

    public static void main (String [] args) {

        String Str;
        int count = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        Str = sc.nextLine();

        System.out.println("Entered String: " + Str);
        Str = Str.toLowerCase();

        System.out.println("New String: "+ removeDuplicate(Str));


    }
}
