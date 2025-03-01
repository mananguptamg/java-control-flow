import java.util.Scanner; // Import Scanner class for user input

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt(); // Read user input

        // Check if the input is a Natural Number (positive integer)
        if (number < 1) {
            System.out.println("Enter a natural number");
        } else {
            // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number.");
                } else {
                    System.out.println(i + " is an Odd number.");
                }
            }
        }
    }
}
