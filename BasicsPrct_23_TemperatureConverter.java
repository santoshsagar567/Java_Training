import java.time.LocalDateTime;
import java.util.Scanner;

public class BasicsPrct_23_TemperatureConverter {

    // Create a TemperatureConverter class with methods to convert Celsius to Fahrenheit and vice versa.
    private double temp;
    private double tempCelsius = 0;
    private double tempFahrenheit = 0;


    // Constructor
    public BasicsPrct_23_TemperatureConverter(double temp) {
        this.temp = temp;

    }

    // Getter methods
    public double getTemperature() {
        return temp;
    }

    // Method to convert Celsius to Fahrenheit
    public void convert_Celsius_to_Fahrenheit() {
        tempFahrenheit = (temp * 9/5) + 32;
        System.out.println("Temperature after conversion from Celsius to Fahrenheit: " + this.tempFahrenheit + "°F");

    }

    // Method to convert Fahrenheit to Celsius
    public void convert_Fahrenheit_to_Celsius() {
        tempCelsius = (temp - 32) * 5/9;
        System.out.println("Temperature after conversion from Fahrenheit to Celsius: " + this.tempCelsius +"°C");

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter! Enter 1 for Temperature conversion from Celsius to Fahrenheit, 2 for Vice-versa.");
        System.out.println("Enter your choice: :");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Enter the temperature in Celsius:");
            double tempInput1 = sc.nextDouble();
            BasicsPrct_23_TemperatureConverter temp1 = new BasicsPrct_23_TemperatureConverter(tempInput1);
            //temp1.convert_Fahrenheit_to_Celsius();
            temp1.convert_Celsius_to_Fahrenheit();
            break;
            case 2:
            System.out.println("Enter the temperature in Fahrenheit:");
            double tempInput2 = sc.nextDouble();
            BasicsPrct_23_TemperatureConverter temp2 = new BasicsPrct_23_TemperatureConverter(tempInput2);
            temp2.convert_Fahrenheit_to_Celsius();
            break;
            default:
                System.out.println("Invalid choice. Try again.");

        }

    }
}