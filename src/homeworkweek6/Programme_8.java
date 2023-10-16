package homeworkweek6;

import java.util.Scanner;

public class Programme_8 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the lengths of the three sides of the triangle
        System.out.println("Enter the lengths of the three sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = calculateTriangleArea(side1, side2, side3);

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner
        scanner.close();
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        // Calculate the semi-perimeter
        double s = (a + b + c) / 2;

        // Calculate the area using Heron's formula: sqrt(s * (s - a) * (s - b) * (s - c))
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}






