import java.util.Scanner; // Import Scanner for user input

public class LeapYearUsingMultipleIfelse {
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
            //Using multiple if-else statements
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is Not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is Not a Leap Year.");
            }
        }

    }
}
