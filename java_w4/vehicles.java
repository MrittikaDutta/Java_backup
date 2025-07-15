package week4_oop;
//6. Java Program with Vehicle, Bus, and Car Classes
class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private String routeNumber;

    Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("Bus Details:");
        System.out.println("Regn Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("Car Details:");
        System.out.println("Regn Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

// Main class to test the classes
public class vehicles {
    public static void main(String[] args) {
        Bus bus = new Bus("UP32AB1234", 60, "Blue", "John Doe", "101");
        Car car = new Car("UP32CD5678", 120, "Red", "Jane Doe", "Toyota");

        bus.showData();
        System.out.println();
        car.showData();
    }
}
