public class Grader {
    private int score;

    // Constructor
    public Grader(int score) {
        this.score = score;
    }

    // Method to get the letter grade
    public char letterGrade() {
        if (score >= 90) {
            return 'O';  // Outstanding
        } else if (score >= 80) {
            return 'E';  // Excellent
        } else if (score >= 70) {
            return 'A';  // Very Good
        } else if (score >= 60) {
            return 'B';  // Good
        } else if (score >= 50) {
            return 'C';  // Average
        } else {
            return 'F';  // Fail
        }
    }
}