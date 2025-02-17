import java.util.Scanner;

public class WhileLoopFizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = input.nextInt();
        int i =0;
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
                while(i <= userInput){
                    System.out.println(i);
                    i+=1;
                }
            }
        }
        else
        {
            System.out.println("Not a Positive Integer");
        }
    }
}
