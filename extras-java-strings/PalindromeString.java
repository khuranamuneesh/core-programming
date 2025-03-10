import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String userInput = input.nextLine();
        boolean value = CheckPalindrome(userInput);
        Print(value);
    }
    public static boolean CheckPalindrome(String str)
    {
        boolean isPalindrome = true;
        String newStr = str.toLowerCase();
        char[] c = newStr.toCharArray();
        int wordLength = str.length();
        for(int i=0; i<wordLength/2; i++)
        {
            if(c[i] != c[wordLength-1-i])
            {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void Print(boolean value)
    {
        if(value)
        {
            System.out.println("Yes, the string is palindrome");
        }
        else
        {
            System.out.println("No, the string is not palindrome");
        }
    }

}
