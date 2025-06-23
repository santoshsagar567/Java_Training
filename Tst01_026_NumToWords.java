import java.util.Scanner;

public class Tst01_026_NumToWords {

    //➤ Convert 45 → “Forty-Five”
    //➤ Purpose: Multiple if/else or switch handling.

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (less than 100) : ");
        int num = sc.nextInt();

        if (num == 10){
            System.out.println("Number in Words : Ten");
        }
        else if (num == 11){
            System.out.println("Number in Words : Eleven");
        }
        else if (num == 12){
            System.out.println("Number in Words : Twelve");
        }
        else if (num == 13){
            System.out.println("Number in Words : Thirteen");
        }
        else if (num == 15){
            System.out.println("Number in Words : Fifteen");
        }
        else {
            int unitsplace = num % 10;
            String unitsplaceword = "";
            switch (unitsplace) {
                case 1:
                    unitsplaceword = "One";
                    break;
                case 2:
                    unitsplaceword = "Two";
                    break;
                case 3:
                    unitsplaceword = "Three";
                    break;
                case 4:
                    unitsplaceword = "Four";
                    break;
                case 5:
                    unitsplaceword = "Five";
                    break;
                case 6:
                    unitsplaceword = "Six";
                    break;
                case 7:
                    unitsplaceword = "Seven";
                    break;
                case 8:
                    unitsplaceword = "Eight";
                    break;
                case 9:
                    unitsplaceword = "Nine";
                    break;
                case 0:
                    unitsplaceword = "";
                default:
                    unitsplaceword = "";

            }
            int tensplace = (num / 10) % 10;
            String tensplaceword = "";
            switch (tensplace) {
                case 1:
                    tensplaceword = "";
                    System.out.println("Number in Words : " + unitsplaceword+"teen");
                    System.exit(0);
                case 2:
                    tensplaceword = "Twenty-";
                    break;
                case 3:
                    tensplaceword = "Thirty-";
                    break;
                case 4:
                    tensplaceword = "Forty-";
                    break;
                case 5:
                    tensplaceword = "Fifty-";
                    break;
                case 6:
                    tensplaceword = "Sixty-";
                    break;
                case 7:
                    tensplaceword = "Seventy-";
                    break;
                case 8:
                    tensplaceword = "Eighty-";
                    break;
                case 9:
                    tensplaceword = "Ninety-";
                    break;
                case 0:
                    System.out.println("Number in Words : Zero");
                    System.exit(0);
                default:
                    tensplaceword = "";

            }
            System.out.println("Number in Words : " + tensplaceword + unitsplaceword);
        }
    }
}
