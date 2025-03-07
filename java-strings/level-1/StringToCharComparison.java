import java.util.Scanner;

public class StringToCharComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String userInput = input.next();
        char[] builtInMethodArray = userInput.toCharArray();
        System.out.print("The char array formed by using built-in method: ");
        for(char elements: builtInMethodArray)
        {
            System.out.print(elements + " ");
        }
        System.out.println();
        char[] userDefinedCharArray = StringToChar(userInput);
        System.out.print("The char array formed by using user-defined method: ");
        for(char elements: userDefinedCharArray)
        {
            System.out.print(elements + " ");
        }
        System.out.println();
        boolean result = CompareTwoStrings(userDefinedCharArray,builtInMethodArray);
        ResultPrint(result);
    }
    public static char[] StringToChar(String s1)
    {
        char[] c = new char[s1.length()];
        for(int j=0; j<s1.length(); j++)
        {
            c[j] = s1.charAt(j);
        }
        return c;
    }
    public static boolean CompareTwoStrings(char[] c1, char[] c2 )
    {
        boolean isStringsEqual = true;
        int length = Math.max(c1.length, c2.length);
        for(int j=0; j<length;j++)
        {
            if(c1[j] != c2[j])
            {
                isStringsEqual = false;
                break;
            }
        }
        return isStringsEqual;
    }
    public static void ResultPrint(boolean b1)
    {
        if(b1)
        {
            System.out.println("Both char-Arrays are equal");
        }
        else
        {
            System.out.println("Both char-Arrays are not equal");
        }
    }
}
