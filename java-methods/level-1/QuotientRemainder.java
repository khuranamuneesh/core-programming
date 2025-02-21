import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the divisor: ");
        int div = input.nextInt();
        System.out.println("The quotient is: " + findRemainderAndQuotient(num,div)[0]);
        System.out.println("The remainder is: " + findRemainderAndQuotient(num,div)[1]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor)
    {
        int quotient = number/divisor;
        int remainder = number % divisor;
        int[] array = {quotient,remainder};
        return array;
    }
}
