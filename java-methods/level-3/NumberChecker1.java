import java.util.Scanner;

public class NumberChecker1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int userInput = input.nextInt();
        System.out.println("The count of digits in a number: " + CountOfDigits(userInput));
        int [] arrayDigits = DigitsInArray(userInput);
        CheckDuckNumber(arrayDigits);
        boolean value = CheckArmstrongNumber(userInput,arrayDigits);
        if(value)
        {
            System.out.println("It's an Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
        LargestAndSecondLargestNumber(arrayDigits);
        SmallestAndSecondSmallestNumber(arrayDigits);
    }

    public static int CountOfDigits(int num)
    {
        int count =0;
        while (num != 0)
        {
            num = num/10;
            count++;
        }
        return count;
    }

    public static int[] DigitsInArray(int num)
    {
        int[] digitArray = new int[CountOfDigits(num)];
        int index =0;
        while (num != 0)
        {
            int value = num % 10;
            digitArray[index] = value;
            num = num/10;
            index++;
        }
        return digitArray;
    }

    public static void CheckDuckNumber(int[] digitArray)
    {
        boolean isDuckNumber = false;
        for(int i=0; i< digitArray.length; i++)
        {
            if(digitArray[0] == 0)
            {
                isDuckNumber = false;
                break;
            }
            else if (digitArray[i] == 0)
            {
                isDuckNumber = true;
            }

        }
        if(isDuckNumber)
        {
            System.out.println("A Duck Number");
        }
        else
        {
            System.out.println("Not a Duck Number");
        }
    }

    public static boolean CheckArmstrongNumber(int num, int[] digitArray)
    {
        int sum=0;
        boolean isArmstrong = false;
        for(int i=0; i< digitArray.length; i++)
        {
            sum = sum + (int) Math.pow(digitArray[i], 3.0D);
        }
        if(num == sum)
        {
            isArmstrong = true;
        }
        return isArmstrong;
    }

    public static void LargestAndSecondLargestNumber(int[] digitArray)
    {

        int largestElement =Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;
        for(int i=0; i< digitArray.length; i++)
        {
            if(digitArray[i] > largestElement)
            {
                secondLargestElement = largestElement;
                largestElement = digitArray[i];
            }
            else if (digitArray[i] > secondLargestElement && digitArray[i] < largestElement)
            {
                secondLargestElement = digitArray[i];
            }
        }
        System.out.println("The Largest Number is: " + largestElement);
        System.out.println("The second Largest Number is: " + secondLargestElement);
    }

    public static void SmallestAndSecondSmallestNumber(int[] digitArray)
    {
        int smallestElement = Integer.MAX_VALUE;
        int secondSmallestElement = Integer.MAX_VALUE;

        for (int i = 0; i < digitArray.length; i++)
        {
            if (digitArray[i] < smallestElement) {
                secondSmallestElement = smallestElement;
                smallestElement = digitArray[i];
            }
            else if (digitArray[i] < secondSmallestElement && digitArray[i] > smallestElement)
            {
                secondSmallestElement = digitArray[i];
            }
        }
            System.out.println("The Smallest Number is: " + smallestElement);
            System.out.println("The Second Smallest Number is: " + secondSmallestElement);
    }
}
