import java.util.Scanner;

public class LeapYearProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Year: ");
        int leapYear = input.nextInt();
        if(leapYear % 4 ==0)
        {
            if(leapYear % 400 ==0 ) //(leapYear % 100 == 0) ---> adding this condition will be redundant as number/400 is also divisible by 100
            {
                System.out.println("Leap Year");
            }
            else if ((leapYear % 400 != 0) && (leapYear % 100 == 0)) //not divisible by 400 but divisible by 100
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
