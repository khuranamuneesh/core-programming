import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
        int factorialProduct =1;
        if(userInput > 0){
            System.out.println("Positive Integer");
            for(int i = userInput; i > 1; i--){
                factorialProduct *= i;
            }
        }
        else
        {
            System.out.println("Not a Positive Integer");
        }
        System.out.println("The factorial of " + userInput + " is " + factorialProduct);
    }
}
