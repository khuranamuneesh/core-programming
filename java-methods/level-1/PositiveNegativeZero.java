import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        System.out.println(numberChecker(number));

    }
    public static int numberChecker(int n)
    {
        if(n < 0)
        {
            return -1;
        }
        else if (n >0)
        {
            return  1;
        }
        else
        {
            return 0;
        }
    }
}
