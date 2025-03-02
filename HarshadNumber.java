import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find sum of digits
        int sumOfDigits = 0;
        int temp = number;

        while (temp > 0) {
            sumOfDigits += temp % 10;  // Extract last digit and add to sum
            temp /= 10;  // Remove last digit
        }

        // Check if number is divisible by sum of digits
        if (number % sumOfDigits == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
    }
}
