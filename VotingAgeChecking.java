import java.util.Scanner; // Import Scanner class for user input

public class VotingAgeChecking {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter their age
        System.out.print("Enter the person's age: ");
        int age = input.nextInt(); // Read the age
        
        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.printf("The person's age is %d and can vote.\n", age);
        } else {
            System.out.printf("The person's age is %d and cannot vote.\n", age);
        }
    }
}
