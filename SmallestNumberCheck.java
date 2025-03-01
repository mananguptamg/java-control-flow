import java.util.Scanner; // Import Scanner class for user input

public class SmallestNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt(); // Read first number
        
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt(); // Read second number
        
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt(); // Read third number
        
        // Check if the first number is the smallest
        String result = (number1 < number2 && number1 < number3) ? "Yes" : "No";
        
        // Display the result
        System.out.println("Is the first number the smallest? "+result);
    }
}
