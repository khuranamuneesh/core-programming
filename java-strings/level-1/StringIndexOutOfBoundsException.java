import java.util.Scanner;
import java.lang.*;

public class StringIndexOutOfBoundsException {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String userInput = input.next();
        HandleException(userInput);
        GenerateIndexOutOfBoundsException(userInput);
    }
    public static void GenerateIndexOutOfBoundsException(String s1)
    {
        char c = s1.charAt(s1.length());
        System.out.println(c);
    }
    public static void HandleException(String s1)
    {
        try
        {
            char c = s1.charAt(s1.length());
             System.out.println(c);
        }
        catch (java.lang.StringIndexOutOfBoundsException excptMessage)
        {
            System.out.println(excptMessage.getMessage());
        }
    }
}
