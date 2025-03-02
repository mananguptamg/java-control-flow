import java.util.Scanner; // Import Scanner for user input

public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for marks in three subjects
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();
        
        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();
        
        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        // Compute total and average marks
        int totalMarks = physics + chemistry + maths;
        double averageMarks = totalMarks / 3.0; // Convert to double for accuracy

        System.out.println("Average Marks: " + String.format("%.2f", averageMarks) + "%");

        // Assign and display grade along with remarks
        String grade, remarks;
        
        if (averageMarks >= 80) {
            grade = "A";
            remarks = "Excellent! Keep up the great work!";
        } else if (averageMarks >= 70) {
            grade = "B";
            remarks = "Good job! Keep striving for excellence.";
        } else if (averageMarks >= 60) {
            grade = "C";
            remarks = "Fair effort! Try to improve further.";
        } else if (averageMarks >= 50) {
            grade = "D";
            remarks = "Needs improvement. Work harder.";
        } else if (averageMarks >= 40) {
            grade = "E";
            remarks = "Poor performance. You need to put in more effort.";
        } else {
            grade = "R";
            remarks = "Remedial standards. Immediate improvement is required.";
        }

        // Display grade and remarks
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}