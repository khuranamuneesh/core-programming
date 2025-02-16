import java.util.Scanner;

public class NaturalNumberSumWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = input.nextInt();
        int formulaValue =0;
        int whileLoopValue = 0;
        if(userInput > 0)//natural number range from 1 to +infinity
        {
            System.out.println("Natural Number");
             formulaValue = (userInput * (userInput + 1))/2;
             while(userInput > 0)
             {
                 whileLoopValue += userInput; // 0 + userInput value in first run
                 userInput -=1; //decreasing the value by 1
             }

            if(formulaValue == whileLoopValue)
            {
                System.out.println("The value by formula is: " + formulaValue);
                System.out.println("The value by using while Loop is: " + whileLoopValue);
                System.out.println("Both the values are equal");
            }
            else
            {
                System.out.println("The values are not equal");
            }
        }
        else
        {
            System.out.println("Not a Natural Number");
        }
    }
}
