import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num <=0 )
        {
            System.exit(0);
        }
        else
        {
            System.out.println("The sum of " + num + " natural numbers using formulae is: " + formula(num));
            System.out.println("The sum of " + num + " natural numbers using recursive methods is: " + recursive(num));
        }

    }
    public static int formula(int n)
    {
        int sum = 0;
        sum = (n*(n+1))/2;
        return sum;
    }
    public static int recursive(int n)
    {
        if (n == 1)
        { // Base case: sum of 1 natural number is 1
            return 1;
        }
        else
        {
            return n + recursive(n - 1); // Recursive case
        }
    }
}

