package homeworkweek6;

import java.util.Scanner;

public class Programme_7 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperatureFahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double temperatureCelsius = convertFahrenheitToCelsius(temperatureFahrenheit);

        // Display the result
        System.out.println("Temperature in Celsius: " + temperatureCelsius + "°C");

        // Close the scanner
        scanner.close();
    }

    public static double convertFahrenheitToCelsius(double temperatureFahrenheit) {
        // Convert Fahrenheit to Celsius using the formula: (F - 32) * 5/9
        return (temperatureFahrenheit - 32) * 5.0 / 9.0;
    }

}
