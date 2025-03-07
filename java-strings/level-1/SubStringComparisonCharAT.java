import java.util.Scanner;

public class SubStringComparisonCharAT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String userInput = input.nextLine();
        System.out.println("Enter the starting index: ");
        int firstIndex = input.nextInt();
        System.out.println("Enter the ending index: ");
        int lastIndex = input.nextInt();
        String newString = userInput.substring(firstIndex,lastIndex);
        System.out.println("The sub-string made by using in-built method is: " + newString);
        char[] charSubString = SubStringCreation(userInput,firstIndex,lastIndex);
        System.out.print("The sub-string made by using charAt() method is: ");
        for(char elements: charSubString)
        {
            System.out.print(elements);
        }
        System.out.println();
        boolean isSubStringEqual = CompareSubString(charSubString,newString);
        ResultPrint(isSubStringEqual);
    }
    public static char[] SubStringCreation(String s1 , int num1, int num2)
    {
        int index = 0;
        int arrayLength = num2 - num1;
        char[] newSubString = new char[arrayLength];
        for(int j= num1; j< num2; j++)
        {
            newSubString[index] = s1.charAt(j);
            index++;
        }
        return newSubString;
    }
    public static boolean CompareSubString(char[] c, String subString1)
    {
        boolean isEqual = true;
        int maxLength = Math.max(c.length,subString1.length());
        for(int j=0; j< maxLength; j++)
        {
            if(c[j] != subString1.charAt(j))
            {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }
    public static void ResultPrint(boolean b1)
    {
        if(b1)
        {
            System.out.println("Sub-strings are equal");
        }
        else
        {
            System.out.println("Sub-strings are not equal");
        }
    }
}
