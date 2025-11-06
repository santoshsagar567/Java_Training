
public class BasicsPrct_03_Rectangle {

    // Write a program with a class Rectangle having attributes length and width. Add a method calculateArea() and display the result. //

    int length = 30;
    int  width = 20;
    int area;

    int calculateArea() {

        area = length*width;
        return area;
    }

    public static void main (String[] args) {

     BasicsPrct_03_Rectangle rectangle = new BasicsPrct_03_Rectangle();

        System.out.println("The area of the rectangle is: " + rectangle.calculateArea());

    }

}
