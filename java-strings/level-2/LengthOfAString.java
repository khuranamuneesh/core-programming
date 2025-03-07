import java.util.Scanner;

public class LengthOfAString {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String userInput = input.nextLine();
        int length = userInput.length();
        System.out.println("The length of string calculated by in-built function is: " + length);
        int size = LengthOfString(userInput);
        System.out.println("The length  of string calculated by using user-defined functions: " + size);

    }
    public static int LengthOfString(String s1)
    {
        int count =0;
        try
        {
            for(int i=0; i>=0;i++)
            {
                if(s1.charAt(i) != 0)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Exception Message: " + e.getMessage());
        }
        return count;
    }
}
