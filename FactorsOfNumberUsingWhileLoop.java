import java.util.Scanner; // Import Scanner for user input

public class FactorsOfNumberUsingWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Enter a positive number");
        } else {
            System.out.print("The factors of " + number + " are: ");
            
            // Initialize variable for loop
            int i = 1;

            // While loop to find factors
            while (i <= number) {
                if (number % i == 0) { // If number is divisible by i, it's a factor
                    System.out.print(i + " ");
                }
                i++; // Increment i
            }
        }
    }
}
