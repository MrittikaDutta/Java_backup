package week4_oop;
//14. Java Program with Vehicle, Car, and Truck Classes
class Vehicle {
    int wheels;
    double speed;

    Vehicle(int wheels, double speed) {
        this.wheels = wheels;
        this.speed = speed;
    }

    void showVehicleDetails() {
        System.out.println("Wheels: " + wheels);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int passengers;

    Car(int wheels, double speed, int passengers) {
        super(wheels, speed);
        this.passengers = passengers;
    }

    void showCarDetails() {
        super.showVehicleDetails();
        System.out.println("Passengers: " + passengers);
    }
}

class Truck extends Vehicle {
    double loadLimit;

    Truck(int wheels, double speed, double loadLimit) {
        super(wheels, speed);
        this.loadLimit = loadLimit;
    }

    void showTruckDetails() {
        super.showVehicleDetails();
        System.out.println("Load Limit: " + loadLimit + " tons");
    }
}

// Main class to test the classes
public class vehi_truck {
    public static void main(String[] args) {
        Car car = new Car(4, 120.0, 5);
        Truck truck = new Truck(6, 80.0, 10.0);

        System.out.println("Car Details:");
        car.showCarDetails();

        System.out.println("\nTruck Details:");
        truck.showTruckDetails();

        System.out.println("\nComparison:");
        if (car.speed > truck.speed) {
            System.out.println("The car is faster.");
        } else {
            System.out.println("The truck is faster.");
        }
    }
}

