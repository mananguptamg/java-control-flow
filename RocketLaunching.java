import java.util.Scanner; // Import Scanner class for user input

public class RocketLaunching {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the starting countdown value
        System.out.print("Enter the countdown ");
        int counter = input.nextInt(); // Read the countdown number
        
        // While loop to count down from the user input to 1
        while (counter >= 1) {
            System.out.println(counter); // Print the current countdown number
            counter--; // Decrement the counter
        }
    }
}
