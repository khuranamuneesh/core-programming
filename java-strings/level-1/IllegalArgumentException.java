import java.lang.*;
import java.util.Scanner;

public class IllegalArgumentException {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String userInput = input.next();
        HandleIllegalArgumentException(userInput);
        GenerateIllegalArgumentException(userInput);
    }
    public static void GenerateIllegalArgumentException(String s1)
    {
        String newS1 = s1.substring(s1.length());
        System.out.println(newS1);
    }
    public static void HandleIllegalArgumentException(String s1)
    {
        try
        {
            String newS1 = s1.substring(s1.length());
            System.out.println(newS1);
        }
        catch (java.lang.IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
