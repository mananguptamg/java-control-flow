import java.util.Scanner; // Import Scanner for user input

public class LeapYearUsingLogicalOperators {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for year
        System.out.print("Enter a year");
        int year = input.nextInt();

        // Check if the year is valid (Gregorian calendar started in 1582)
        if (year < 1582) {
            System.out.println("Please enter a year >= 1582.");
        } else {
            //Using a single if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is Not a Leap Year.");
            }
        }
    }
}
