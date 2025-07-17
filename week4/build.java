package week4_oop;
//9. Java Program with Building, House, and Office Classes
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

class Office extends Building {
    int telephones;
    int tables;

    Office(int floors, int rooms, double totalFootage, int telephones, int tables) {
        super(floors, rooms, totalFootage);
        this.telephones = telephones;
        this.tables = tables;
    }

    void showOfficeDetails() {
        super.showBuildingDetails();
        System.out.println("Telephones: " + telephones);
        System.out.println("Tables: " + tables);
    }
}

// Main class to test the classes
public class build {
    public static void main(String[] args) {
        House house = new House(2, 5, 2000.0, 3, 2);
        house.showHouseDetails();
        
        System.out.println();

        Office office = new Office(3, 10, 5000.0, 20, 15);
        office.showOfficeDetails();
    }
}
