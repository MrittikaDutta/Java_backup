package week5_oop;

// Question 2: Create a class called Time, which has three private instance variables – hour, min and sec.
// It contains a method called add() which takes one Time object as a parameter and prints the added value
// of the calling Time object and passes the Time object. In the main method, declare two Time objects and assign
// values using the constructor and call the add() method.

class Time {
    private int hour, min, sec;

    Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    void add(Time t) {
        int totalSeconds = this.toSeconds() + t.toSeconds();
        Time result = Time.fromSeconds(totalSeconds);
        System.out.println("Added Time: " + result.hour + " hours " + result.min + " minutes " + result.sec + " seconds");
    }

    private int toSeconds() {
        return hour * 3600 + min * 60 + sec;
    }

    private static Time fromSeconds(int totalSeconds) {
        int hour = totalSeconds / 3600;
        int min = (totalSeconds % 3600) / 60;
        int sec = totalSeconds % 60;
        return new Time(hour, min, sec);
    }
}

// Main class to test the Time class
public class time_ {
    public static void main(String[] args) {
        Time time1 = new Time(2, 30, 45);
        Time time2 = new Time(1, 45, 15);
        time1.add(time2);
    }
}
//Added Time: 4 hours 16 minutes 0 seconds
