import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudents = 5;
        String[] students = new String[numStudents];
        double[] scores = new double[numStudents];
        double sum = 0;

        // Input student names
        System.out.println("Enter student names:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = sc.nextLine();
        }

        // Input test scores
        System.out.println("Enter test scores:");
        for (int j = 0; j < numStudents; j++) {
            System.out.print("Score for " + students[j] + ": ");
            scores[j] = sc.nextDouble();
            sum += scores[j];
        }

        double avg = sum / numStudents;
        System.out.println("Overall average: " + avg);
    }
}
