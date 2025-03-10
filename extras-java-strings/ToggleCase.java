import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String userInput = input.nextLine();
        char[] toggledCharArray = ToggledString(userInput);
        Print(toggledCharArray);

    }
    public static char[] ToggledString(String str)
    {
        char[] c = str.toCharArray();
        for(int i=0; i< c.length; i++ )
        {
            if(c[i] >= 97 && c[i] <= 122)
            {
                c[i] = (char) (c[i] -32);
            }
            else if (c[i] >= 65 && c[i] <= 90)
            {
                c[i] = (char) (c[i] + 32);
            }
        }
        return c;
    }
    public static void Print(char[] c)
    {
        for(char elements: c)
        {
            System.out.print(elements);
        }
    }
}
