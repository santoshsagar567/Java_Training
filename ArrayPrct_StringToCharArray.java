import java.util.Scanner;

public class ArrayPrct_StringToCharArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String Str = sc.nextLine();

        System.out.println("Entered String : "+Str);
        /*  *** Without using built in function ***
        int len = Str.length();
        char [] ch = new char[len];

        for(int i =0;i<len;i++){

            ch[i] = Str.charAt(i);
        }
        */

        // *** Using toCharArray Function ***
        char [] ch = Str.toCharArray();

        System.out.println("Contents of Array : ");
        for(char j: ch) {
            System.out.print(j+" ");
        }

    }
}

