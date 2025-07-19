import java.util.Scanner;

public class StrPrct_CheckAlphabets {

    public static boolean checkDigits(String Str){

        for(int i = 0; i <Str.length(); i++) {
            char c = Str.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String Str = sc.nextLine();

        System.out.println("Entered String : "+Str);

        Str = Str.toLowerCase();

        if(checkDigits(Str)){
            System.out.println("String has Digits!!");
        }
        else{
            System.out.println("String has only Alphabets!!");
        }

    }


}
