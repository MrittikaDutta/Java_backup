package week4_oop;
//12. Combined Program with Num, HexNum, and OctNum Classes
class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void showNum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {

    HexNum(int number) {
        super(number);
    }

    @Override
    void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
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
public class Main_combined {
    public static void main(String[] args) {
        Num num = new Num(255);
        num.showNum();

        HexNum hexNum = new HexNum(255);
        hexNum.showNum();

        OctNum octNum = new OctNum(255);
        octNum.showNum();
    }
}
