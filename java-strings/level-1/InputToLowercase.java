import java.util.Scanner;

public class InputToLowercase {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String userInput = input.nextLine();
        String userInputToLowerCase = userInput.toLowerCase();
        System.out.println("The text in lowercase by using in-built string method - " + "\n" + userInputToLowerCase);
        char[] textToLower = TextToLower(userInput);
        for(char elements: textToLower)
        {
            System.out.print(elements);
        }
        System.out.println();
        boolean value = CompareTwoStrings(textToLower,userInputToLowerCase);
        Print(value);
    }
    public static char[] TextToLower(String s1)
    {
        char[] c;
        c = s1.toCharArray();
        for(int i=0; i<s1.length();i++)
        {
            if(s1.charAt(i) >= 65 && s1.charAt(i) <=90)
            {
                c[i] = (char) (s1.charAt(i) + 32);
            }
        }
        return c;
    }
    public static boolean CompareTwoStrings(char[] c, String s2)
    {
        boolean isEqual = true;
        char[] c2 = s2.toCharArray();
        int num = Math.max(c.length,s2.length());
        for(int i=0; i< num; i++)
        {
            if(c[i] != c2[i])
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
