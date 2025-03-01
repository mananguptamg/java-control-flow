import java.util.Scanner; // Import Scanner class for user input

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read user input

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
   	}
    }
}
