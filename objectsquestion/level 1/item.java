import java.util.Scanner;
class Item {
    int itemCode;
    String itemName;
    double price;
	Item(int code, String name, double p) {
        itemCode = code;
        itemName = name;
        price = p;
    }

    double totalCost(int quantity) {
        return price * quantity;
    }

    void display(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost(quantity));
    }

    public static void main(String[] args) {
        Item i = new Item(101, "Pen", 10);
        i.display(5);
    }
}