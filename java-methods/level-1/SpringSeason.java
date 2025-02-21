import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the date: ");
        int date = input.nextInt();
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        print(date,month);
    }
    public static boolean seasonChecker(int a, int b)
    {
        if(b==3)
        {
            if( a>=20 && a<=31)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (b > 3 && b <6 )
        {
            return  true;
        }
        else if (b ==6)
        {
            if(a >=1 && a<= 20)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public static void print(int a, int b)
    {
        if(seasonChecker(a,b))
        {
            System.out.println("Its a Spring Season");
        }
        else
        {
            System.out.println("Not a Spring Season");
        }
    }
}
