package week5_oop.week_6;
// Q 11.
// Abstract class AbstractProduct
abstract class AbstractProduct {
    String product_id;
    String name;
    String description;

    public AbstractProduct(String product_id, String name, String description) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
    }

    abstract void displayDetails();
}

// Class Product extends AbstractProduct
class Product extends AbstractProduct {
    double price;

    public Product(String product_id, String name, String description, double price) {
        super(product_id, name, description);
        this.price = price;
    }

    @Override
    void displayDetails() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
    }
}

// Class Book extends Product
class Book extends Product {
    String isbn;
    String author;
    String title;

    public Book(String product_id, String name, String description, double price, String isbn, String author, String title) {
        super(product_id, name, description, price);
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
    }
}

// Class TravelGuide extends Book
class TravelGuide extends Book {
    String country;

    public TravelGuide(String product_id, String name, String description, double price, String isbn, String author, String title, String country) {
        super(product_id, name, description, price, isbn, author, title);
        this.country = country;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Country: " + country);
    }
}

// Class CompactDisc extends Product
class CompactDisc extends Product {
    String artist;
    String title;

    public CompactDisc(String product_id, String name, String description, double price, String artist, String title) {
        super(product_id, name, description, price);
        this.artist = artist;
        this.title = title;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Artist: " + artist);
        System.out.println("Title: " + title);
    }
}

// Test Class
public class TestProducts {
    public static void main(String[] args) {
        Book book = new Book("B001", "Java Programming", "Learn Java in Depth", 45.0, "123-456-789", "John Doe", "Java Programming");
        TravelGuide travelGuide = new TravelGuide("T001", "Europe Travel", "Guide to Europe", 30.0, "987-654-321", "Jane Smith", "Europe Travel", "Europe");
        CompactDisc cd = new CompactDisc("CD001", "Greatest Hits", "Top Songs Collection", 20.0, "The Beatles", "Greatest Hits");

        book.displayDetails();
        System.out.println();
        travelGuide.displayDetails();
        System.out.println();
        cd.displayDetails();
    }
}
