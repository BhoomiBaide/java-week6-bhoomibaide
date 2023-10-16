package homeworkweek6;

import java.util.Scanner;

public class Programme_16 {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first binary number
        System.out.print("Input first binary number: ");
        String bin1 = sc.nextLine();

        // Prompt the user to enter the second binary number
        System.out.print("Input second binary number: ");
        String bin2 = sc.nextLine();

        // Close the scanner
        sc.close();

        // Convert the binary strings to integers using radix 2
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        // Add the two numbers
        int sum = num1 + num2;

        // Convert the sum back to binary using Integer.toBinaryString method
        String binSum = Integer.toBinaryString(sum);

        // Print the result
        System.out.println("Sum of two binary numbers: " + binSum);
    }
    }


