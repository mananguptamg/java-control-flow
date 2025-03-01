import java.util.Scanner; // Import Scanner class for user input

public class SumOfNumbersTillZero {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Initialize total sum variable
        double total = 0.0;

        // Variable to store user input
        double number;

        // Prompt the user for input
        System.out.print("Enter a number ");
        number = input.nextDouble();

        // While loop runs until user enters 0
        while (number != 0) {
            total += number; // Add user input to total

            // Prompt user again for input
            System.out.print("Enter a number ");
            number = input.nextDouble();
        }

        // Display the final total
        System.out.println("The total sum is: " + total);
    }
}
