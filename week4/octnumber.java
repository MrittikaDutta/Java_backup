package week4_oop;
//11. Java Program with Num and OctNum Classes
class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void showNum() {
        System.out.println("Number: " + number);
    }
}

class OctNum extends Num {

    OctNum(int number) {
        super(number);
    }

    @Override
    void showNum() {
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

// Main class to test the classes
public class octnumber {
    public static void main(String[] args) {
        Num num = new Num(255);
        num.showNum();

        OctNum octNum = new OctNum(255);
        octNum.showNum();
    }
}

