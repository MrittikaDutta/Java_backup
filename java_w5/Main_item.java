package week5_oop;
// Question 8: Define a class Item containing code and price. Accept this data for five objects
// using an array of objects. Display code, price in tabular form and also display total price of all items.

import java.util.Scanner;

class Item {
    private int code;
    private double price;

    Item(int code, double price) {
        this.code = code;
        this.price = price;
    }

    void displayItem() {
        System.out.printf("%-10d %-10.2f\n", code, price);
    }

    static void displayTotalPrice(Item[] items) {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.price;
        }
        System.out.println("Total Price: " + totalPrice);
    }
}

// Main class to test Item class
public class Main_item {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item[] items = new Item[5];

        for (int i = 0; i < items.length; i++) {
            System.out.print("Enter code for item " + (i + 1) + ": ");
            int code = scanner.nextInt();
            System.out.print("Enter price for item " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            items[i] = new Item(code, price);
        }

        System.out.println("\nCode     Price");
        for (Item item : items) {
            item.displayItem();
        }

        Item.displayTotalPrice(items);
    }
}

/*
Sample Output:
Enter code for item 1: 101
Enter price for item 1: 15.50
Enter code for item 2: 102
Enter price for item 2: 25.75
Enter code for item 3: 103
Enter price for item 3: 10.00
Enter code for item 4: 104
Enter price for item 4: 22.10
Enter code for item 5: 105
Enter price for item 5: 30.00

Code     Price
101      15.50
102      25.75
103      10.00
104      22.10
105      30.00
Total Price: 103.35
*/
