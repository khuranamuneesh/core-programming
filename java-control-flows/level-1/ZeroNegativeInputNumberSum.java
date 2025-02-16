import java.util.Scanner;

public class ZeroNegativeInputNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double userInput = input.nextDouble();
        double sum = 0.0;
        while(true){
            if(userInput <= 0){
                break;
            }
            else
            {
                sum += userInput;
                System.out.print("Enter the number again: ");
                userInput = input.nextDouble();
            }
        }
        System.out.println("The sum till the user entered zero or negative number is: " + sum);
    }
}
