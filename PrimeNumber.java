import java.util.Scanner; // Import Scanner for user input

public class PrimeNumber {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is prime
        boolean isPrime = true; // Assume the number is prime initially

        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to sqrt(number) to check divisibility
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) { // If divisible, it's not a prime number
                    isPrime = false;
                    break; // Exit loop early
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}
