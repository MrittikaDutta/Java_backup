package week5_oop.week_6;
//7. Creating an Interface Player and Implementing it in Various Classes

interface Player {
    void play();
}

// Child Class
class Child implements Player {
    @Override
    public void play() {
        System.out.println("The child is playing with toys.");
    }
}

// Musician Class
class Musician implements Player {
    @Override
    public void play() {
        System.out.println("The musician is playing an instrument.");
    }
}

// Actor Class
class Actor implements Player {
    @Override
    public void play() {
        System.out.println("The actor is performing on stage.");
    }
}

// UsePlayer Application
public class UsePlayer {
    public static void main(String[] args) {
        Player child = new Child();
        Player musician = new Musician();
        Player actor = new Actor();

        child.play();
        musician.play();
        actor.play();
    }
}
