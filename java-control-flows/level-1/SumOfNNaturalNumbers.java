import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = input.nextInt();
        int sum =0;
        if(userInput > 0 ) //natural numbers start from +1 to +infinity
        {
            sum = (userInput * (userInput + 1))/2;
            System.out.println("The sum of " + userInput + " natural numbers is " + sum);
        }
        else{
            System.out.println("The number " + userInput + " is not a natural number");
        }
    }
}
