import java.util.Scanner;

public class BasicsPrct_13_Calculator {

    // Create a class Calculator with overloaded methods add() that accepts different types (int, double, etc.). //

    int num1, num2;
    float num3, num4;
    double num5, num6;


    void add(int a, int b){
        num1=a;
        num2=b;
        System.out.println("Result : "+(num1+num2));
    }

    void add(float a, float b){
        num3=a;
        num4=b;
        System.out.println("Result : "+(num3+num4));
    }

    void add(double a, double b){
        num5=a;
        num6=b;
        System.out.println("Result : "+(num5+num6));
    }


    public static void main (String[] args) {

     BasicsPrct_13_Calculator sum = new BasicsPrct_13_Calculator();

     sum.add(20,38);
     sum.add(14.5,52.9);
     sum.add(62.984,81.473);


    }

}
