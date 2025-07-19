package week5_oop.week_6;

// Q 13
class Vehicle {
    int ID;
    String Name;
    String LicenseNumber;

    // Constructor
    public Vehicle(int ID, String Name, String LicenseNumber) {
        this.ID = ID;
        this.Name = Name;
        this.LicenseNumber = LicenseNumber;
    }

    // Method to display vehicle details
    void display() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + Name);
        System.out.println("License Number: " + LicenseNumber);
    }
}

// Derived class TwoWheeler extends Vehicle
class TwoWheeler extends Vehicle {
    String SteeringHandle;

    // Constructor
    public TwoWheeler(int ID, String Name, String LicenseNumber, String SteeringHandle) {
        super(ID, Name, LicenseNumber);
        this.SteeringHandle = SteeringHandle;
    }

    // Method to display two-wheeler details
    @Override
    void display() {
        super.display();  // Display base class details
        System.out.println("Steering Handle: " + SteeringHandle);
    }
}

// Derived class FourWheeler extends Vehicle
class FourWheeler extends Vehicle {
    String SteeringWheel;

    // Constructor
    public FourWheeler(int ID, String Name, String LicenseNumber, String SteeringWheel) {
        super(ID, Name, LicenseNumber);
        this.SteeringWheel = SteeringWheel;
    }

    // Method to display four-wheeler details
    @Override
    void display() {
        super.display();  // Display base class details
        System.out.println("Steering Wheel: " + SteeringWheel);
    }
}

// Driver class to test the implementation
public class TestVehicle {
    public static void main(String[] args) {
        // Creating an instance of TwoWheeler
        TwoWheeler bike = new TwoWheeler(1, "Motorbike", "ABC123", "Standard Handle");
        System.out.println("Two-Wheeler Details:");
        bike.display();

        // Creating an instance of FourWheeler
        FourWheeler car = new FourWheeler(2, "Car", "XYZ456", "Power Steering");
        System.out.println("\nFour-Wheeler Details:");
        car.display();
    }
}
