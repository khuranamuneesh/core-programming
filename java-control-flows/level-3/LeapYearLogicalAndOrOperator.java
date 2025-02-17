import java.util.Scanner;

public class LeapYearLogicalAndOrOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Year: ");
        int leapYear = input.nextInt();
        //logic - leap year is divisible by 400 or 4 and not by 100
        if((leapYear % 400 ==0) || (leapYear % 4 ==0 && leapYear % 100 != 0))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
