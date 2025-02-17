import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;
        int lastDigit;
        while(originalNumber != 0)
        {
            lastDigit = originalNumber % 10; //last digit will be stored as remainder ---> 153 % 10 = 3
            lastDigit = lastDigit * lastDigit * lastDigit;
            sum = sum + lastDigit;
            originalNumber = originalNumber/10; // original number will be 15 as 15.3 will be round off
        }
        if(number == sum){
            System.out.println("The sum is: " + sum);
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("The sum is: " + sum);
            System.out.println("Not an Armstrong Number");
        }
    }
}
