import java.util.Scanner; // Import Scanner class for user input

public class FizzBuzzUsingWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter number ");
        int number = input.nextInt(); // Read user input

        // Check if the number is a positive integer
        if (number > 0) {
            int i = 1; // Initialize counter
            while (i <= number) {
                // Check for multiples of 3 and 5 (both)
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if not a multiple of 3 or 5
                else {
                    System.out.println(i);
                }
                i++; // Increment counter
            }
        } else {
            System.out.println("Enter a positive number.");
        }
    }
}
