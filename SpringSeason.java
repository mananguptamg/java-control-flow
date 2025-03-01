// Java program to check if the given date falls in the Spring Season

import java.util.Scanner; // Import Scanner class for user input

public class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter month and day
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt(); // Read the month
        
        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt(); // Read the day
        
        // Check if the date falls in Spring Season
        boolean isSpring = (month == 3 && day >= 20) ||  // March 20 onwards
                           (month == 4) ||  // Whole April
                           (month == 5) ||  // Whole May
                           (month == 6 && day <= 20); // Until June 20

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
