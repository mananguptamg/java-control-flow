import java.util.Scanner; // Import Scanner for user input

public class MultiplesOfNumberUsingForLoop {
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

            // Loop from 1 to 99 (numbers below 100)
            for (int i = number; i < 100; i += number) {
                System.out.print(i + " "); // Print the multiple
            }
        }
    }
}
