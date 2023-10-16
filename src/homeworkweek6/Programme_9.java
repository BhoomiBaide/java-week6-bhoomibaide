package homeworkweek6;

import java.util.Scanner;

public class Programme_9 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string in uppercase
        System.out.print("Enter a string in uppercase: ");
        String inputString = scanner.nextLine();

        // Convert the uppercase string to lowercase
        String lowercaseString = inputString.toLowerCase();

        // Display the result
        System.out.println("String in lowercase: " + lowercaseString);

        // Close the scanner
        scanner.close();
    }
}
