import java.util.Scanner; // Import Scanner class for user input

public class LargestNumberCheck {
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
        
        // Check which number is the largest
        String firstLargest  = (number1 > number2 && number1 > number3) ? "Yes" : "No";
        String secondLargest = (number2 > number1 && number2 > number3) ? "Yes" : "No";
        String thirdLargest  = (number3 > number1 && number3 > number2) ? "Yes" : "No";
        
        // Display the results
        System.out.println("Is the first number the largest? "+firstLargest);
        System.out.println("Is the second number the largest? "+secondLargest);
        System.out.println("Is the third number the largest? "+thirdLargest);
    }
}
