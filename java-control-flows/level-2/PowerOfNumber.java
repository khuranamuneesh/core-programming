import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        int result = 1;
        for(int i=1; i<=power; i++) //will loop from 1 to p
        {
            result = result * number; //can be written as result *= number
        }
        System.out.println("The result is: " + result);
    }
}
