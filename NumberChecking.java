import java.util.Scanner; // Import Scanner class for user input

public class NumberChecking {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number
        
        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
