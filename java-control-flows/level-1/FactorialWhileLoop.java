import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
        int index = userInput;
        int factorialProduct =1;
        if(userInput > 0){
            System.out.println("Positive Integer");
            while(index != 1) //will iterate one less loop as the product of 1 with any number is number itself
            {
                factorialProduct *= index;
                index -=1;
            }
        }
        else
        {
            System.out.println("Not a Positive Integer");
        }
        System.out.println("The factorial of " + userInput + " is " + factorialProduct);
    }
}
