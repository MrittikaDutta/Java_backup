package week4_oop;
//15. Java Program Demonstrating Multilevel Inheritance
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

class SportsCar extends Car {
    String model;

    SportsCar(int wheels, double speed, int passengers, String model) {
        super(wheels, speed, passengers);
        this.model = model;
    }

    void showSportsCarDetails() {
        super.showCarDetails();
        System.out.println("Model: " + model);
    }
}

// Main class to test the classes
public class Multi_level {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar(4, 200.0, 2, "Ferrari");
        sportsCar.showSportsCarDetails();
    }
}
