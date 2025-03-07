import java.util.Scanner;

public class StringsComparisonCharAt {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String userInput1 = input.nextLine();
        System.out.print("Enter the second String: ");
        String userInput2 = input.nextLine();
        boolean result1 = CompareStrings(userInput1,userInput2);
        PrintResult(result1);
        System.out.println("-----------------------------------------------------------------------------------------");
        boolean result2 = userInput1.equals(userInput2);
        if(result2)
        {
            System.out.println("Strings are equal checked using the in-built strings methods");
        }
        else
        {
            System.out.println("Strings are not equal checked using the in-built strings methods");
        }

    }

    public static boolean CompareStrings(String s1, String s2)
    {
        boolean isEqual = true;
        int maxLength = Math.max(s1.length(),s2.length());
        for(int j=0; j<maxLength;j++)
        {
            if(s1.charAt(j) != (s2.charAt(j)) )
            {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }
    public static void PrintResult(boolean result)
    {
        if(result)
        {
            System.out.println("Strings are equal checked using the in-built charAt() methods");
        }
        else
        {
            System.out.println("Strings are not equal checked using the in-built charAt() methods");
        }
    }
}
