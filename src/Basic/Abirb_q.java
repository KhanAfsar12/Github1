package Basic;

import java.util.Scanner;

public class Abirb_q{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks for subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks for subject 3: ");
        double subject3 = scanner.nextDouble();

        // Calculate the average
        double average = (subject1 + subject2 + subject3) / 3;

        System.out.println("Marks for Subject 1: " + subject1);
        System.out.println("Marks for Subject 2: " + subject2);
        System.out.println("Marks for Subject 3: " + subject3);
        System.out.println("Average Marks: " + average);

        scanner.close();
    }
}
