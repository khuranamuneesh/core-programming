import java.util.Scanner;

public class SumOfNNatural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("The sum of " + number + " Natural Numbers is: " + sum(number));
    }
    public static int sum(int n)
    {
        if(n >0) //natural numbers range from 1 to +infinity
        {
            int sum = (n * (n+1))/2;
            return sum;
        }
        else
        {
            return -1;
        }
    }

}
