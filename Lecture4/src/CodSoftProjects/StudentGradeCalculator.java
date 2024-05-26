package CodSoftProjects;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static double calculateTotalMarks(double[] marks) {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    public static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 75) {
            return 'B';
        } else if (averagePercentage >= 60) {
            return 'C';
        } else if (averagePercentage >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = s.nextInt();

        // Input marks for each subject
        double[] marks = new double[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = s.nextDouble();
        }

        // Calculate total marks and average percentage
        double totalMarks = calculateTotalMarks(marks);
        double averagePercentage = totalMarks / numSubjects;

        // Determine grade
        char grade = calculateGrade(averagePercentage);

        // Display results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);

        s.close();
    }
}
