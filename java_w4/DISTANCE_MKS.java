package week4_oop;
//13. Java Program with Distance and DistanceMKS Classes
class Distance {
    double miles;

    Distance(double miles) {
        this.miles = miles;
    }

    void travelTime() {
        double time = miles / 60.0; // Assuming speed is 60 miles per hour
        System.out.println("Time to travel " + miles + " miles at 60 mph: " + time + " hours");
    }
}

class DistanceMKS extends Distance {

    DistanceMKS(double kilometers) {
        super(kilometers);
    }

    @Override
    void travelTime() {
        double time = miles / 100.0; // Assuming speed is 100 km per hour
        System.out.println("Time to travel " + miles + " kilometers at 100 km/h: " + time + " hours");
    }
}

// Main class to test the classes
public class DISTANCE_MKS {
    public static void main(String[] args) {
        Distance distance = new Distance(120);
        distance.travelTime();

        DistanceMKS distanceMKS = new DistanceMKS(120);
        distanceMKS.travelTime();
    }
}
