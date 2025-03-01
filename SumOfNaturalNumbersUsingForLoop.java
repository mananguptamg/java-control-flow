import java.util.Scanner; // Import Scanner class for user input

public class SumOfNaturalNumbersUsingForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt(); // Read user input

        // Check if the number is a natural number (n > 0)
        if (n > 0) {
            // Compute sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i; // Add i to sum
            }

            // Display both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

        } else {
            // If the number is not a natural number
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
