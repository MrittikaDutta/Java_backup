package week5_oop.week_6;
// q 15
interface Mango {
    void taste();
}

class Winter implements Mango {
    @Override
    public void taste() {
        System.out.println("Winter Mango is sweet.");
    }
}

class Summer implements Mango {
    @Override
    public void taste() {
        System.out.println("Summer Mango is juicy.");
    }
}

public class Main_mango{
    public static void main(String[] args) {
        Mango winterMango = new Winter();
        Mango summerMango = new Summer();

        winterMango.taste();
        summerMango.taste();
    }
}
