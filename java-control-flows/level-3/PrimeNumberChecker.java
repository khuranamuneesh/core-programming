import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        while(number <= 1)
        {
            System.out.print("Enter the number which is greater than 1: ");
            number = input.nextInt();
        }
        boolean isPrime = true;
        for(int i=2; i<number; i++ )
        {
            if(number % i ==0)
            {
                isPrime = false;
                break;
            }
        }
        System.out.println("Is number " + number + " a Prime Number? " + isPrime);
    }
}
