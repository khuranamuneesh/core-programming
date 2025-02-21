import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        int principalAmount = input.nextInt();
        System.out.print("Enter the Rate: ");
        int rate = input.nextInt();
        System.out.print("Enter the Time: ");
        int time = input.nextInt();
        simpleInterest(principalAmount,rate,time);

    }
    public static void simpleInterest(int p, int r, int t)
    {
        int simpleInterest = (p*r*t)/100;
        System.out.println("\"The simple interest is " + simpleInterest + " for Principal " + p + " ,Rate of Interest " + r + " and Time " + t + "\"");
    }
}
