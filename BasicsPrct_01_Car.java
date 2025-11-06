public class BasicsPrct_01_Car {

    // Create a class Car with attributes brand, model, and price. Create an object and print its details. //

    String Brand = "Tata";
    String Model = "Nexon";
    String Color = "Black";
    int Price = 1400000;

    public static void main (String[] args) {

     BasicsPrct_01_Car car = new BasicsPrct_01_Car();
        System.out.println("Brand: " + car.Brand);
        System.out.println("Model: " + car.Model);
        System.out.println("Color: " + car.Color);
        System.out.println("Price: " + car.Price);

    }

}
