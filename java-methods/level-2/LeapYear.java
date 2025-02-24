import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int number = input.nextInt();
        leapYear(number);

    }
    public static void leapYear(int n)
    {
        if(n % 4 ==0)
        {
            if(n % 400 ==0)
            {
                System.out.println("Leap Year");
            }
            else if (n % 100 ==0 && n % 400 !=0)
            {
                System.out.println("Not a Leap Year");
            }
            else
            {
                System.out.println("Leap Year");
            }
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
