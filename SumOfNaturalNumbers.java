import java.util.Scanner; // Import Scanner class for user input

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number
        
        // Check if the number is a natural number (positive integer)
        if (number >= 1) {
            // Calculate the sum of first n natural numbers using formula
            int sum = number * (number + 1) / 2;
            System.out.printf("The sum of %d natural numbers is %d\n", number, sum);
        } else {
            System.out.printf("The number %d is not a natural number\n", number);
        }
    }
}
