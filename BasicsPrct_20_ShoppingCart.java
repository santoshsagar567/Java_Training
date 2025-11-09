import java.util.ArrayList;
import java.util.List;

class Item {

    private String itemName;
    private int itemQuantity;
    private double itemPrice;
    private double itemTotal;

    // Constructor
    public Item(String itemName, int itemQuantity,  double itemPrice) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;

    }

    // Getter methods
    public String getitemName() {
        return itemName;
    }

    public double getitemPrice() {
        return itemPrice;
    }

    public int getitemQuantity() {
        return itemQuantity;
    }


    public double getitemTotal() {
        itemTotal = itemPrice * itemQuantity;
        return itemTotal;
    }

    @Override
    public String toString() {
        return itemName +  ", Quantity: " + itemQuantity + " (Price: Rs " + String.format("%.2f", itemPrice) +")";
    }

}


public class BasicsPrct_20_ShoppingCart {

    // Create a ShoppingCart class that holds multiple Item objects and calculates total cost.
    private List<Item> items;

    public BasicsPrct_20_ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }


    // Calculates the total cost of all items in the shopping cart
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getitemTotal();
        }
        return totalCost;
    }

    // Displays the contents of the shopping cart
    public void displayCartContents() {
        if (items.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
            return;
        }
        System.out.println("--- Shopping Cart Contents ---");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        BasicsPrct_20_ShoppingCart cart = new BasicsPrct_20_ShoppingCart();

        Item item1 = new Item("Laptop", 1, 32000.00);
        Item item2 = new Item("Mouse", 2, 450.00);
        Item item3 = new Item("Keyboard", 2, 850.00);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.displayCartContents();
        System.out.println("Total cost: Rs " + String.format("%.2f", cart.calculateTotalCost()));

    }

}