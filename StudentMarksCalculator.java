/**
 * Program Name: StudentMarksCalculator
 * Description: Calculates total and average marks of a student.
 */

import java.util.Scanner;

public class StudentMarksCalculator {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter marks for Subject 1: ");
        double subject1 = input.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double subject2 = input.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double subject3 = input.nextDouble();

        // Calculating total
        double totalMarks = subject1 + subject2 + subject3;

        // Calculating average
        double averageMarks = totalMarks / 3;

        // Displaying result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        input.close();
    }
}