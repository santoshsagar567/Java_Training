import java.util.Scanner;

public class StrPrct_ReverseString {

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

        System.out.println("Reversed String: "+revStr);

    }
}
