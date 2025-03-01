import java.util.Scanner; // Import Scanner class for user input

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt(); // Read user input

        // Check if the number is a positive integer
        if (n < 0) {
            System.out.println("Entered number is negative number.");
        } else {
            // Initialize variables for factorial calculation
            long factorial = 1; // Using long to handle large values
            int i = n;

            // Compute factorial using while loop
            while (i > 0) {
                factorial *= i; // Multiply factorial with i
                i--; // Decrement i
            }

            // Display the result
            System.out.println("The factorial of " + n + " is: " + factorial);
        }
    }
}
