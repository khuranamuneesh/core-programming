import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String userInput = input.nextLine();
        String[] str = StringToArray(userInput);
        for(String elements: str)
        {
            System.out.println(elements + " ");
        }
    }
    public static String[] StringToArray(String str)
    {
        char[] c = str.toCharArray();
        String[] strArray = new String[c.length];
        int num =0;
        int beginIndex =0;

        for(int i=0; i< c.length; i++)
        {
            if(c[i] == 0)
            {
                strArray[num] = str.substring(beginIndex,i-1);
                beginIndex = i +1;
                num++;
            }
        }
        return strArray;
    }
}
