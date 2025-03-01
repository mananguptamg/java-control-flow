import java.util.Scanner; // Import Scanner class for user input

public class RocketLaunchingForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the starting countdown value
        System.out.print("Enter the countdown ");
        int counter = input.nextInt(); // Read the countdown number
        
        // For loop to count down from the user input to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); // Print the countdown number
        }
    }
}
