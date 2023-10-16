package homeworkweek6;

import java.util.Scanner;

public class Programme_10 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        // Print the multiplication table for the entered number
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }

        // Close the scanner
        scanner.close();


    }
}
