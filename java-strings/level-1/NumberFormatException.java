import java.util.Scanner;

public class NumberFormatException
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String userInput = input.next();
        HandleNumberFormatException(userInput);
        //GenerateNumberFormatException(userInput);

    }
    public static void GenerateNumberFormatException(String s1)
    {
        int number = Integer.parseInt(s1);
        System.out.println("Text in a string is: " + number);
    }
    public static void HandleNumberFormatException(String s1)
    {
        try
        {
            int number = Integer.parseInt(s1);
            System.out.println("Text in a string is: " + number);
        }
        catch (java.lang.NumberFormatException nfException)
        {
            System.out.println(nfException.getMessage());
        }

    }
}
