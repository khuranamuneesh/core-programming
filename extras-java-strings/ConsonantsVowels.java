import java.util.Scanner;

public class ConsonantsVowels {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String userInput = input.nextLine();
        System.out.println("The number of Vowels are: " + VowelsCount(userInput));
        System.out.println("The number of Consonants are: " + ConsonantsCount(userInput));
    }
    public static int VowelsCount(String str)
    {
        String newString = str.toLowerCase();
        char[] c = newString.toCharArray();
        int vowelsCount =0;
        for(int i=0; i<c.length; i++)
        {
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] =='u')
            {
                vowelsCount +=1;
            }
        }
        return vowelsCount;
    }
    public static int ConsonantsCount(String str)
    {
        String newString = str.toLowerCase();
        char[] c = newString.toCharArray();
        int consonantsCount =0;
        int totalLength = newString.length();
        for(int i=0; i<c.length; i++)
        {
            if(c[i] == '0')
            {
                totalLength -= 1;
            }
        }
        consonantsCount = totalLength - VowelsCount(str);
        return consonantsCount;
    }
}
