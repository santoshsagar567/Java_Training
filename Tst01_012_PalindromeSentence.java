import java.util.Scanner;

public class Tst01_012_PalindromeSentence {

    //➤ Check if "A man, a plan, a canal: Panama" is a palindrome.
    //➤ Purpose: Remove non-alphabetic chars, ignore case.

     public static String clearString(String s1){
         String s2 = s1.replaceAll("[^a-zA-Z0-9]","");
        return s2;
    }

    public static void main (String [] args){

        String Str;
        String clnStr = "";
        String revStr = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        Str = sc.nextLine();

        clnStr = clearString (Str);
        System.out.println("Cleaned String :"+clnStr);

        for (int i = clnStr.length()-1; i >=0; i--){
            revStr = revStr + clnStr.charAt(i);
        }

        System.out.println("Reversed String :"+revStr);

        if (clnStr.equalsIgnoreCase(revStr)){
            System.out.println("It is a Palindrome !!");
        }
        else {
            System.out.println("It is not a Palindrome !!");
        }
    }
}
