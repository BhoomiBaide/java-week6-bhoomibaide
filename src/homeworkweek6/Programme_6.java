package homeworkweek6;

import java.util.Scanner;

public class Programme_6 {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the radius
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            // Calculate the area of the circle
            double area = calculateCircleArea(radius);

            // Display the result
            System.out.println("The area of the circle with radius " + radius + " is: " + area);

            // Close the scanner
            scanner.close();
        }

        public static double calculateCircleArea(double radius) {
            // Calculate the area using the formula: A = π * r^2
            return Math.PI * radius * radius;
        }

}
