import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String userInput = input.nextLine();
        char[] reversedString = ReversedString(userInput);
        for(char elements: reversedString)
        {
            System.out.print(elements);
        }
    }
    public static char[] ReversedString(String str)
    {
        char[] c1 = str.toCharArray();
        int length = c1.length;
        char[] c2 = new char[str.length()];
        for(int i=0; i< c2.length; i++)
        {
            c2[i] = c1[length-1-i];
        }
        return c2;
    }
}
