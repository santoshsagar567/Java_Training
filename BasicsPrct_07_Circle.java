import java.util.Scanner;

public class BasicsPrct_07_Circle {

    // Create a class Circle with a method calculateArea() and calculateCircumference() using the radius. //

    public static double radius;
    double area = 0.0;
    double circumference = 0.0;

    double calculateArea(){
        area = 3.14 * radius * radius;
        return area;
    }

    double calculateCircumference(){
        circumference = 2 * 3.14 * radius;
        return circumference;
    }


    public static void main (String[] args) {

     BasicsPrct_07_Circle circle = new BasicsPrct_07_Circle();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the radius of the circle: ");
     radius = sc.nextDouble();

     System.out.println("Area of the circle: " + circle.calculateArea());
     System.out.println("Circumference of the circle: " + circle.calculateCircumference());


    }

}
