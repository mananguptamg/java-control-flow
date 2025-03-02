import java.util.Scanner; // Import Scanner for user input

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize sum and store original number
        int sum = 0;
        int originalNumber = number;

        // Use a while loop to extract digits and calculate the sum of cubes
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get last digit
            sum += digit * digit * digit;    // Add cube of the digit to sum
            originalNumber /= 10;            // Remove last digit
        }

        // Check if the sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
    }
}
