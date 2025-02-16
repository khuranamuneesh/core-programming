import java.util.Scanner;

public class OddEvenNumberOneToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        if(number > 0)
        {
            System.out.println("Natural Number");
            for(int i=1; i<=number; i++)
            {
                if(i % 2 ==0)
                {
                    System.out.println("Even Number " + i);
                }
                else
                {
                    System.out.println("Odd Number " + i);
                }
            }
        }
        else
        {
            System.out.println("Not a Natural Number");
        }
    }
}
