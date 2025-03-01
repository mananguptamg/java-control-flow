import java.util.Scanner; // Import Scanner class for user input

public class SumOfNumbersTillZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Initialize total sum variable
        double total = 0.0;

        // Infinite loop
        while (true) {
            // Prompt user for input
            System.out.print("Enter a number ");
            double number = input.nextDouble();

            // Check if the number is 0 or negative, then break the loop
            if (number <= 0) {
                break;
            }

            // Add the number to the total sum
            total += number;
        }

        // Display the final total
        System.out.println("The total sum is: " + total);
    }
}
