import java.util.Scanner;


public class Main {
    public static double calculateTotalMarks(double[] marks){
        double total = 0;
        for (double mark : marks){
            total += mark;
        }
        return total;
    }
    public static char calculateGrade(double averagePercentage){
        if (averagePercentage >= 90) {
            return 'A';
        }
     else if (averagePercentage >= 75) {
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
        // input subject
        System.out.println("Enter number of Subjects: ");
        int numSubject = s.nextInt();
        // input their marks
        double marks[] = new double[numSubject];
        for (int i=0;i<numSubject;i++){
            System.out.println("Enter marks of subject"+i+": ");
            marks[i] = s.nextInt();
        }
        //calculate total marks and %
        double totalMarks = calculateTotalMarks(marks);
        double avgPercentage = totalMarks / numSubject;

        // determine grade
        char grade = calculateGrade(avgPercentage);
        // DISPLAY
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", avgPercentage) + "%");
        System.out.println("Grade: " + grade);
        s.close();
    }
}
