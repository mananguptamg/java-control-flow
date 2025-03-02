import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the month, day, and year
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt(); // Month (1-12)

        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt(); // Day

        System.out.print("Enter year (e.g., 2023): ");
        int y = scanner.nextInt(); // Year

        // Calculate the day of the week using the provided formula
        int yo = y - (14 - m) / 12;
        int x = yo + yo / 4 - yo / 100 + yo / 400;
        int mo = m + 12 * ((14 - m) / 12) - 2;
        int dayOfWeek = (d + x + 31 * mo / 12) % 7;

        // Print the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        System.out.println("The day of the week is: " + dayOfWeek);
    }
}
