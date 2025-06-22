import java.util.Scanner;

public class Tst01_023_TriangleType {

    //➤ Based on 3 sides, determine triangle type or invalid triangle.
    //➤ Purpose: Condition combination logic.

    public static void main (String[] args){

        System.out.println("Enter the 3 sides of the Triangle: ");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        if ((s1+s2)>s3 && (s1+s3)>s2 && (s2+s3)>s1){
            if ((s1==s2)&& (s2==s3)){
                System.out.println("Equilateral Triangle!!");
            }
            else if ((s1==s2) || (s2==s3) || (s1==s3)){
                System.out.println("Isosceles Triangle!!");
            }
            else{
                System.out.println("Scalene Triangle!!");
            }
        }
        else{
            System.out.println("Invalid Triangle!!");
        }
    }
}


