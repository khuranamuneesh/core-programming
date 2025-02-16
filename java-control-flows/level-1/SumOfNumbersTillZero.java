import java.util.Scanner;

public class SumOfNumbersTillZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double userInput = input.nextDouble();
        double sum = 0.0;
        while(userInput !=0){
            sum += userInput;
            System.out.print("Enter the number again: ");
            userInput = input.nextDouble();
        }
        System.out.println();
        System.out.println("The sum till the user entered zero is: " + sum);
    }
}
