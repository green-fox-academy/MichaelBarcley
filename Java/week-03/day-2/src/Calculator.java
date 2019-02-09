import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)
        // You can use the Scanner class

        programGreeter();

        Scanner inputScanner = new Scanner(System.in);
        String userInput = inputScanner.nextLine();
        String[] seperatedInput = userInput.split(" ");

        String operation = seperatedInput[0];
        double number1 = Double.parseDouble(seperatedInput[1]);
        double number2 = Double.parseDouble(seperatedInput[2]);

        System.out.println(calculate(operation, number1, number2));
    }

    public static void programGreeter() {
        System.out.println("Hello.");
        System.out.println("Please type in the expression:");
    }

    public static double calculate(String operationCalc, double number1Calc, double number2Calc) {
        double calculated = 0;

        if (operationCalc.equals("+")) {
            calculated = number1Calc + number2Calc;
        } else if (operationCalc.equals("-")) {
            calculated = number1Calc - number2Calc;
        } else if (operationCalc.equals("*")) {
            calculated = number1Calc * number2Calc;
        } else if (operationCalc.equals("/")) {
            calculated = number1Calc / number2Calc;
        } else if (operationCalc.equals("%")) {
            calculated = number1Calc % number2Calc;
        }
        return calculated;
    }
}
