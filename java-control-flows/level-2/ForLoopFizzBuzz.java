import java.util.Scanner;

public class ForLoopFizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = input.nextInt();
        if(userInput >=0){
            System.out.println("Positive Integer");
            if((userInput % 3 ==0) && (userInput % 5 ==0)){
                System.out.println("FizzBuzz");
            }
            else if (userInput % 3 ==0)
            {
                System.out.println("Fizz");
            }
            else if (userInput % 5 ==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                for(int i=0; i<=userInput;i++)
                {
                    System.out.println(i);
                }
            }
        }
        else
        {
            System.out.println("Not a Positive Integer");
        }
    }
}
