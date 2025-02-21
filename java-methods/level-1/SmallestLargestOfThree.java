import java.util.Scanner;

public class SmallestLargestOfThree {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        System.out.println("The smallest number is: " + findSmallestAndLargest(num1,num2,num3)[0]);
        System.out.println("The largest number is: " + findSmallestAndLargest(num1,num2,num3)[1]);
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3)
    {
        int largestNumber = Math.max(number1, Math.max(number2,number3));
        int smallestNumber = Math.min(number1, Math.min(number2,number3));
        int[] array = {smallestNumber,largestNumber};
        return array;
    }
}
