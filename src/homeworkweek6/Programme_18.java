package homeworkweek6;

import java.util.Scanner;

public class Programme_18 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Input the first number: ");
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Input the second number: ");
        double number2 = scanner.nextDouble();

        // Perform arithmetic operations
        double sum = number1 + number2;
        double product = number1 * number2;
        double difference = number1 - number2;
        double quotient = number1 / number2;
        double remainder = number1 % number2;

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Close the scanner
        scanner.close();
    }


        }



