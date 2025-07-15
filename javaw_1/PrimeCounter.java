//14. Write a Java program to count the prime numbers in an array.
public class PrimeCounter {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int countPrimes(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int primeCount = countPrimes(numbers);
        System.out.println("Number of prime numbers in the array: " + primeCount);
    }
}
