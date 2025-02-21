import java.util.Scanner;

public class ChocolateDistributionChildren
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of chocolates to be distributed: ");
        int chocoNumber = input.nextInt();
        System.out.print("Enter the number of students: ");
        int studentNumber = input.nextInt();
        System.out.println("The number of chocolates each child gets: " + findRemainderAndQuotient(chocoNumber,studentNumber)[0]);
        System.out.println("The number of remaining chocolates: " + findRemainderAndQuotient(chocoNumber,studentNumber)[1]);

    }
    public static int[] findRemainderAndQuotient(int number, int divisor)
    {
        int quotient = number/divisor;
        int remainder = number % divisor;
        int[] array = {quotient,remainder};
        return array;
    }
}
