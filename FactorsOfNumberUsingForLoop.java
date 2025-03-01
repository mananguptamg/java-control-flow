import java.util.Scanner; // Import Scanner for user input

public class FactorsOfNumberUsingWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter number ");
        int number = input.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Enter a number");
        } else {
            System.out.print("The factors of " + number + " are: ");

            // Loop from 1 to the number and check divisibility
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) { // If number is divisible by i, it's a factor
                    System.out.print(i + " ");
                }
            }
        }
    }
}
