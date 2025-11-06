import java.util.Scanner;

public class BasicsPrct_14_Student {

    // Create a Student class that has marks of 3 subjects. Add a method calculateAverage() and another to print grade based on the average. //

    public static int sub1, sub2, sub3;
    float avg = 0;

    void calculateAverage(int a, int b, int c){
        sub1=a;
        sub2=b;
        sub3=c;
        avg = (sub1+sub2+sub3)/3;
        System.out.println("Average Marks : "+avg);
    }

    void printGrade(){

        if(avg>=95){
            System.out.println("Grade is Grade 'O' - Outstanding");
        }
        else if(avg>=85 & avg<95){
            System.out.println("Grade is Grade 'A' - Excellent");
        }
        else if(avg>=75 & avg<85){
            System.out.println("Grade is Grade 'B' - Good");
        }
        else if(avg>=60 & avg<75){
            System.out.println("Grade is Grade 'C' - Average");
        }
        else if(avg>=40 & avg<60){
            System.out.println("Grade is Grade 'D' - Poor");
        }
        else {
            System.out.println("Grade is Grade 'F' - Fail");
        }

    }



    public static void main (String[] args) {

     BasicsPrct_14_Student S1 = new BasicsPrct_14_Student();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Marks of Subject 1: ");
     sub1 = sc.nextInt();
     System.out.println("Enter the Marks of Subject 2: ");
     sub2 = sc.nextInt();
     System.out.println("Enter the Marks of Subject 3: ");
     sub3 = sc.nextInt();
     S1.calculateAverage(sub1, sub2, sub3);
     S1.printGrade();

    }

}
