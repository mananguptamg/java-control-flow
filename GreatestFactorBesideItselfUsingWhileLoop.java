import java.util.Scanner; // Import Scanner for user input

public class GreatestFactorBesideItselfUsingWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Check if the input is a positive integer
        if (number <= 1) {
            System.out.println("Enter a positive number");
        } else {
            int greatestFactor = 1; // Initialize the greatest factor variable
            int i = number - 1; // Start checking from the number - 1

            // While loop to find the greatest factor
            while (i >= 1) {
                if (number % i == 0) { // If number is divisible by i, assign it to greatestFactor and break
                    greatestFactor = i;
                    break;
                }
                i--; // Decrement i
            }

            // Display the greatest factor found
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }
    }
}
