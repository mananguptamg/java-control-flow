import java.util.Scanner; // Import Scanner for user input

public class MultiplesOfNumberUsingWhileLoop {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Check if the input is valid
        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive number");
        } else {
            System.out.println("Multiples of " + number + " below 100:");

            int i = 100; // Start from 100
            while (i > 0) { // Run the loop backward from 100 to 1
                if (i % number == 0) { // Check if i is a multiple of number
                    System.out.print(i + " "); // Print the multiple
                }
                i--; // Decrement i
            }
        }
    }
}
