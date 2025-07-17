package week4_oop;
//10. Java Program with Num and HexNum Classes
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

// Main class to test the classes
public class hexnum1 {
    public static void main(String[] args) {
        Num num = new Num(255);
        num.showNum();

        HexNum hexNum = new HexNum(255);
        hexNum.showNum();
    }
}

