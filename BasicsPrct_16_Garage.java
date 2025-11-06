import java.util.ArrayList;
import java.util.List;

// Car.java
class Car {
    private String make;
    private String model;
    private int year;
    private String colour;

    public Car(String make, String model, int year,  String colour) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Colour: " + colour;
    }
}

// Garage.java

public class BasicsPrct_16_Garage {
    private String name;
    private List<Car> cars;

    public BasicsPrct_16_Garage(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void removeCar(Car car) {
        this.cars.remove(car);
    }

    public void printAllCarDetails() {
        System.out.println("Cars in " + this.name + ":");
        if (cars.isEmpty()) {
            System.out.println("No cars in the garage.");
        } else {
            for (Car car : cars) {
                //System.out.println(car.toString());
                System.out.println(car);
            }
        }
    }

    public static void main(String[] args) {
        // Create Car objects
        Car car1 = new Car("Toyota", "Camry", 2020, "Red");
        Car car2 = new Car("Honda", "Civic", 2022,  "Blue");
        Car car3 = new Car("Ford", "Mustang", 2018, "Black");

        // Create a Garage object
        BasicsPrct_16_Garage myGarage = new BasicsPrct_16_Garage("My Home Garage");

        // Add cars to the garage
        myGarage.addCar(car1);
        myGarage.addCar(car2);
        myGarage.addCar(car3);

        // Print details of all cars in the garage
        myGarage.printAllCarDetails();

        System.out.println("\nRemoving a car...");
        myGarage.removeCar(car2);

        // Print details again after removal
        myGarage.printAllCarDetails();
    }
}