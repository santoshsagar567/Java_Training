public class BasicsPrct_09_Laptop {

    // Create a Laptop class with brand, RAM, and price. Create multiple constructors (constructor overloading). //

    String brand;
    int ramGB;
    int price;

    // Default constructor
    BasicsPrct_09_Laptop(){
        this.brand = "Unknown";
        this.ramGB = 0;
        this.price = 0;
        System.out.println("Laptop created with default values.");
    }

    // Constructor with brand only
    BasicsPrct_09_Laptop(String brand){
        this(); // Calls the default constructor to set default RAM and price
        this.brand = brand;
        System.out.println("Laptop created with brand only.");
    }

    // Constructor with brand & RAM
    BasicsPrct_09_Laptop(String brand, int ramGB){
        this(); // Calls the default constructor to set default price
        this.brand = brand;
        this.ramGB = ramGB;
        System.out.println("Laptop created with brand & RAM.");
    }

    // Constructor with brand, RAM & Price
    BasicsPrct_09_Laptop(String brand, int ramGB, int price){
        //this(); // Calls the default constructor
        this.brand = brand;
        this.ramGB = ramGB;
        this.price = price;
        System.out.println("Laptop created with brand, RAM & Price.");
    }


    void displayInfo(){

        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ramGB);
        System.out.println("Price: " + price);
    }


    public static void main (String[] args) {

     BasicsPrct_09_Laptop L1 = new BasicsPrct_09_Laptop();
     System.out.println("Laptop 1 Details");
     L1.displayInfo();

     BasicsPrct_09_Laptop L2 = new BasicsPrct_09_Laptop("HP");
     System.out.println("Laptop 2 Details");
     L2.displayInfo();

     BasicsPrct_09_Laptop L3 = new BasicsPrct_09_Laptop("Asus",8);
     System.out.println("Laptop 3 Details");
     L3.displayInfo();

     BasicsPrct_09_Laptop L4 = new BasicsPrct_09_Laptop("Dell",16,75000);
     System.out.println("Laptop 4 Details");
     L4.displayInfo();


    }

}
