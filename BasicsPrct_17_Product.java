import java.util.Scanner;

public class BasicsPrct_17_Product {

    // Create a Product class with attributes name, price, and quantity. Add a method to calculate total cost and discount if applicable. //

    public static String productName;
    public static float price;
    public static int quantity;
    double totalCost = 0.0;
    double discAmount = 0.0;
    double finalPrice = 0.0;

    void calculateTotalCost(String productName, float price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        totalCost =  price * quantity;
        System.out.println("Total Cost : "+totalCost);
    }

    void calculateDiscount(){

        if(totalCost>=1000){
            System.out.println("10% Discount Applicable");
            discAmount = totalCost*0.10;
            finalPrice = totalCost-discAmount;
            System.out.println("Amount to be Paid : "+finalPrice);
        }
        else if(totalCost>=500 & totalCost<1000){
            System.out.println("5% Discount Applicable");
            discAmount = totalCost*0.05;
            finalPrice = totalCost-discAmount;
            System.out.println("Amount to be Paid : "+finalPrice);
        }
        else {
            System.out.println("No Discount Applicable");
            System.out.println("Amount to be Paid : "+totalCost);
        }

    }



    public static void main (String[] args) {

     BasicsPrct_17_Product P1 = new BasicsPrct_17_Product();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Name of Product: ");
     productName = sc.nextLine();
     System.out.println("Enter the Price of Product: ");
     price = sc.nextFloat();
     System.out.println("Enter the quantity of Product: ");
     quantity = sc.nextInt();
     P1.calculateTotalCost(productName,price,quantity);
     P1.calculateDiscount();

    }

}
