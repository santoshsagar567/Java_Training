import java.util.Scanner;

public class CheckPalindrome {

    public static void main (String [] args){

        String Str;
        String revStr = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        Str = sc.nextLine();

        System.out.println("Entered String: "+Str);

        for(int i = Str.length()-1; i >=0; i--){
            revStr = revStr + Str.charAt(i);
        }

        //System.out.println("Reversed String: "+revStr);

        if (Str.equalsIgnoreCase(revStr)){
            System.out.println("It is a Palindrome !!");
        }
        else{
            System.out.println("It is not a Palindrome !!");
        }

    }
}
