package homeworkweek6;

public class Programme_5 {
    // Static method to add two numbers
    public static String add(double num1, double num2) {
        double result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    // Static method to subtract two numbers
    public static String subtract(double num1, double num2) {
        double result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    // Instance method to multiply two numbers
    public String multiply(double num1, double num2) {
        double result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    // Instance method to divide two numbers
    public String divide(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            return num1 + " / " + num2 + " = " + result;
        }
            return "Division by zero is not allowed.";

    }

    public static void main(String[] args) {
        Programme_5 calculator = new Programme_5();

        // Static method calls
        System.out.println(Programme_5.add(5, 3));
        System.out.println(Programme_5.subtract(10, 4));

        // Instance method calls
        System.out.println(calculator.multiply(6, 2));
        System.out.println(calculator.divide(8, 2));
        System.out.println(calculator.divide(7, 0)); // Division by zero
    }
}


