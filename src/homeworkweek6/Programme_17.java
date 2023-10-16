package homeworkweek6;

import java.util.Scanner;

public class Programme_17 {
    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a Decimal Number:  ");
        int decimalNumber = scanner.nextInt();

        //Convert decimal number to binary
        String binaryNumber = decimalToBinary(decimalNumber);

        // Display the binary equivalent
        System.out.println("Binary Equivalent: " + binaryNumber);

        // Close the scanner
        scanner.close();
    }

    public static String decimalToBinary(int decimalNumber) {
        // Use the built-in Integer.toBinaryString method to convert to binary
        return Integer.toBinaryString(decimalNumber);
    }



    }

