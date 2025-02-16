import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        float number1 = input.nextFloat();
        System.out.print("Enter the Second Number: ");
        float number2 = input.nextFloat();
        float addNumber = number1 + number2;
        float subNumber = number1 - number2;
        float multiplyNumber = number1 * number2;
        float divisionNumber = number1 / number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1+" and " + number2 + " is " + addNumber + "," + subNumber + "," +multiplyNumber+ "," + " and " + divisionNumber);

    }
}
