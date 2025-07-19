package week5_oop.week_6;
//9. Creating an Abstract Class MotorVehicle and Subclass Car
// Abstract Class MotorVehicle
abstract class MotorVehicle {
    String modelName;
    String modelNumber;
    double modelPrice;

    public MotorVehicle(String modelName, String modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    abstract void display();
}

// Subclass Car
class Car extends MotorVehicle {
    double discountRate;

    public Car(String modelName, String modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    @Override
    void display() {
        System.out.println("Car Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Model Price: " + modelPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
    }

    void discount() {
        double discountAmount = modelPrice * discountRate / 100;
        System.out.println("Discount Amount: " + discountAmount);
    }
}

// Test the Car Class
public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S", "TES123", 79999, 5);
        car.display();
        car.discount();
    }
}

