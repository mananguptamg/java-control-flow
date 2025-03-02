import java.util.Scanner; // Import Scanner for user input

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Handle the case for 0 separately
        if (number == 0) {
            System.out.println("The number 0 has 1 digit.");
            return;
        }

        // Initialize counter
        int count = 0;

        // Use a while loop to count the digits
        while (number > 0) {
            number /= 10; // Remove the last digit
            count++;              // Increment count
        }

        // Display the result
        System.out.println("The count of digits is "+ count);
    }
}
