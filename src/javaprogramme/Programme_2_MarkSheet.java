package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();

        int mathMarks, scienceMarks, englishMarks;

        // Input and validate marks for three subjects
        do {
            System.out.print("Enter Math marks (0-100): ");
            mathMarks = scanner.nextInt();
        } while (mathMarks < 0 || mathMarks > 100);

        do {
            System.out.print("Enter Science marks (0-100): ");
            scienceMarks = scanner.nextInt();
        } while (scienceMarks < 0 || scienceMarks > 100);

        do {
            System.out.print("Enter English marks (0-100): ");
            englishMarks = scanner.nextInt();
        } while (englishMarks < 0 || englishMarks > 100);

        // Calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (double) totalMarks / 300 * 100;

        // Determine result and grade
        String result, grade;
        if (percentage >= 35) {
            result = "Pass";

            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }
        } else {
            result = "Fail";
            grade = "N/A";
        }

        // Call the printMarkSheet method to print the mark sheet
        printMarkSheet(name, rollNo, mathMarks, scienceMarks, englishMarks, totalMarks, percentage, result, grade);

        scanner.close();
    }

    // Method to print the mark sheet
    public static void printMarkSheet(String name, int rollNo, int mathMarks, int scienceMarks, int englishMarks, int totalMarks, double percentage, String result, String grade) {
        System.out.println("_____________________________");
        System.out.println("|                           |");
        System.out.println("|       Mark Sheet          |");
        System.out.println("|___________________________|");
        System.out.println("| Name : " + name);
        System.out.println("| Roll No: " + rollNo);
        System.out.println("|___________________________|");
        System.out.println("| Subjects : Marks          |");
        System.out.println("|___________________________|");
        System.out.println("| Math : " + mathMarks);
        System.out.println("| Science : " + scienceMarks);
        System.out.println("| English : " + englishMarks);
        System.out.println("|___________________________|");
        System.out.println("| Total : " + totalMarks);
        System.out.println("|___________________________|");
        System.out.println("| Percentage : " + percentage);
        System.out.println("| Result : " + result);
        System.out.println("| Grade : " + grade);
        System.out.println("|___________________________|");
    }

}
