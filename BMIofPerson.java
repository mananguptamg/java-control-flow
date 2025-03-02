import java.util.Scanner; // Import Scanner for user input

public class BMIofPerson {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get user input for weight and height
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100.0;

        // Calculate BMI using the formula
        double bmi = weight / (heightMeters * heightMeters);

        // Determine weight status based on BMI value
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display BMI and weight status
        System.out.printf("Your BMI is %.2f\n", bmi);
        System.out.println("Status: " + status);
    }
}
