import java.util.Scanner;

public class SpringSeasonChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        System.out.print("Enter the date: ");
        int date = input.nextInt();
        if(month ==3)
        {
            if(date >=20 && date <=31)
            {
                System.out.println("Its a Spring Season");
            }
            else
            {
                System.out.println("Not a Spring Season");
            }
        }
        else if (month >3 && month <6)
        {
            System.out.println("Its a Spring Season");
        }
        else if (month ==6) {
            if(date >=1 && date <=20)
            {
                System.out.println("Its a Spring Season");
            }
            else
            {
                System.out.println("Not a Spring Season");
            }
        }
        else
        {
            System.out.println("Not a Spring Season");
        }
    }
}
