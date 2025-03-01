import java.util.Scanner; // Import Scanner for user input

public class PowerOfNumberUsingWhileLoop {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for base number
        System.out.print("Enter number ");
        int number = input.nextInt();

        // Take user input for power
        System.out.print("Enter the power ");
        int power = input.nextInt();

        // Validate inputs (both should be positive)
        if (number < 0 || power < 0) {
            System.out.println("Enter a positive number");
        } else {
            int result = 1; // Initialize result variable to 1
            int i = 1; // Initialize counter

            // Loop to calculate power
            while (i <= power) {
                result *= number; // Multiply result by number
                i++; // Increment counter
            }

            // Print the final result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
    }
}
