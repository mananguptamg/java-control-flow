import java.util.Scanner; // Import Scanner for user input

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking age inputs for Amar, Akbar, and Anthony
        System.out.print("Enter Amar age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Akbar age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Anthony age: ");
        int ageAnthony = input.nextInt();

        // Taking height inputs for Amar, Akbar, and Anthony
        System.out.print("Enter Amar height: ");
        double heightAmar = input.nextDouble();
        System.out.print("Enter Akbar height: ");
        double heightAkbar = input.nextDouble();
        System.out.print("Enter Anthony height: ");
        double heightAnthony = input.nextDouble();

        // Finding the youngest friend
        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        // Finding the tallest friend
        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
