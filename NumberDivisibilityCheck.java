import java.util.Scanner; // Import Scanner class for user input

public class NumberDivisibilityCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number
        
        // Check divisibility by 5 using modulus operator
        String result = (number % 5 == 0) ? "Yes" : "No";
        
        // Display the result
        System.out.printf("Is the number %d divisible by 5? %s\n", number, result);
    }
}
