import java.util.Scanner;

public class InputToUpperCase {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String userInput = input.nextLine();
        String userInputToUpperCase = userInput.toUpperCase();
        System.out.println("The text in UPPERCASE by using in-built string method - " + "\n" + userInputToUpperCase);
        char[] textToUpper = TextToUpper(userInput);
        boolean value = CompareTwoStrings(textToUpper,userInputToUpperCase);
        Print(value);
    }
    public static char[] TextToUpper(String s1)
    {
        char[] c;
        c = s1.toCharArray();
        for(int i=0; i<s1.length();i++)
        {
            if(s1.charAt(i) >= 97 && s1.charAt(i) <=122)
            {
                c[i] = (char) (s1.charAt(i) - 32);
            }
        }
        return c;
    }
    public static boolean CompareTwoStrings(char[] c, String s2)
    {
        boolean isEqual = true;
        int num = Math.max(c.length,s2.length());
        for(int i=0; i< num; i++)
        {
            if(c[i] != s2.charAt(i))
            {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }
    public static void Print(boolean value)
    {
        if(value)
        {
            System.out.println("Both the strings are equal");
        }
        else
        {
            System.out.println("Both the strings are not equal");
        }
    }
}
