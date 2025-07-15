package week4_oop;
//8. Java Program with Building and House Classes
class Building {
    int floors;
    int rooms;
    double totalFootage;

    Building(int floors, int rooms, double totalFootage) {
        this.floors = floors;
        this.rooms = rooms;
        this.totalFootage = totalFootage;
    }

    void showBuildingDetails() {
        System.out.println("Building Details:");
        System.out.println("Floors: " + floors);
        System.out.println("Rooms: " + rooms);
        System.out.println("Total Footage: " + totalFootage + " sq ft");
    }
}

class House extends Building {
    int bedrooms;
    int bathrooms;

    House(int floors, int rooms, double totalFootage, int bedrooms, int bathrooms) {
        super(floors, rooms, totalFootage);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    void showHouseDetails() {
        super.showBuildingDetails();
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + bathrooms);
    }
}
public class houses {
    public static void main(String[] args) {
        House house = new House(2, 5, 2000.0, 3, 2);
        house.showHouseDetails();
    }
}

