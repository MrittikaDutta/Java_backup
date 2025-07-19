// 10. Implement the below Diagram.
// Here, Asset class is an abstract class containing an abstract method displayDetails() method.
// Stock, bond and Savings class inherit the Asset class and displayDetails() method is defined in
// every class.

package week5_oop.week_6;
// Abstract Class Asset
abstract class Asset {
    String descriptor;
    String date;
    double current_value;

    public Asset(String descriptor, String date, double current_value) {
        this.descriptor = descriptor;
        this.date = date;
        this.current_value = current_value;
    }

    // Abstract method
    abstract void displayDetails();
}

// Stock Class
class Stock extends Asset {
    int num_shares;
    double share_price;

    public Stock(String descriptor, String date, double current_value, int num_shares, double share_price) {
        super(descriptor, date, current_value);
        this.num_shares = num_shares;
        this.share_price = share_price;
    }

    @Override
    void displayDetails() {
        System.out.println("Stock Details:");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Number of Shares: " + num_shares);
        System.out.println("Share Price: " + share_price);
    }
}

// Bond Class
class Bond extends Asset {
    double interest_rate;
    double asset;

    public Bond(String descriptor, String date, double current_value, double interest_rate, double asset) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
        this.asset = asset;
    }

    @Override
    void displayDetails() {
        System.out.println("Bond Details:");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate);
        System.out.println("Asset: " + asset);
    }
}

// Savings Class
class Savings extends Asset {
    double interest_rate;
    double asset;

    public Savings(String descriptor, String date, double current_value, double interest_rate, double asset) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
        this.asset = asset;
    }

    @Override
    void displayDetails() {
        System.out.println("Savings Details:");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate);
        System.out.println("Asset: " + asset);
    }
}

// Test Class
public class TestAssets {
    public static void main(String[] args) {
        Stock stock = new Stock("Tech Stocks", "2024-09-01", 15000.00, 100, 150.00);
        Bond bond = new Bond("Government Bond", "2024-09-02", 10000.00, 3.5, 10000);
        Savings savings = new Savings("Savings Account", "2024-09-03", 5000.00, 1.5, 5000);

        stock.displayDetails();
        bond.displayDetails();
        savings.displayDetails();
    }
}
