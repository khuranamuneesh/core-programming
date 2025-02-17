import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();
        System.out.print("Enter any operator \"+\", \"-\", \"*\" or \"/\": ");
        String op = input.next();
        double result =0;
        switch (op)
        {
            case "+":
                result = first + second;
                System.out.println(first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println(first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println(first + " * " + second + " = " + result);
                break;
            case "/":
                result = first / second;
                System.out.println(first + " / " + second + " = " + result);
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }
}
