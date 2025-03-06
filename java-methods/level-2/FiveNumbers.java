import java.util.Scanner;

public class FiveNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] userInput = new int[5];
        for(int i=0; i< userInput.length; i++)
        {
            System.out.println("Enter the " + (i+1) + " Number: ");
            userInput[i] = input.nextInt();
            numberCheck(userInput[i]);
        }
        for (int element : userInput) {
            numberCheck(element);
        }
        compare(userInput[0],userInput[userInput.length-1]);


    }
    public static void numberCheck(int num)
    {
        if(num >= 0)
        {
            System.out.print("Positive Number - ");
            oddEvenChecker(num);
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
    public static void oddEvenChecker(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
    public static void compare(int num1, int num2)
    {
        if(num1 > num2)
        {
            System.out.println("First Element is greater than last element");
        }
        else if (num1 == num2)
        {
            System.out.println("First Element is equal to the last element");
        }
        else
        {
            System.out.println("First Element is lesser than last element");
        }
    }
}
