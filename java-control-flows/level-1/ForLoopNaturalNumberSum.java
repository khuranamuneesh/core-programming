import java.util.Scanner;

public class ForLoopNaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = input.nextInt();
        int formulaValue =0;
        int forLoopValue = 0;
        if(userInput > 0)//natural number range from 1 to +infinity
        {
            System.out.println("Natural Number");

            formulaValue = (userInput * (userInput + 1))/2; //formula calculation

            for(int i=userInput; i >0; i--)
            {
                forLoopValue = forLoopValue +  i;
            }

            if(formulaValue == forLoopValue)
            {
                System.out.println("The value by formula is: " + formulaValue);
                System.out.println("The value by using while Loop is: " + forLoopValue);
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
