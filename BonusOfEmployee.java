import java.util.Scanner; // Import Scanner class for user input

public class BonusOfEmployee {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for salary input
        System.out.print("Enter your salary ");
        double salary = input.nextDouble();

        // Prompt user for years of service input
        System.out.print("Enter your years of service: ");
        int yearsOfService = input.nextInt();

        // Initialize bonus variable
        double bonus = 0;

        // Check if employee is eligible for bonus (more than 5 years of service)
        if (yearsOfService > 5) {
            bonus = 0.05 * salary; // 5% of the salary
            System.out.println("Your bonus amount is " + bonus);
        } else {
            System.out.println("No bonus. Years of service less than or equal to 5");
        }
    }
}
