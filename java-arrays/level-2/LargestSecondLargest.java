import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int maxDigit=10;
        int[] digits = new int[maxDigit];
        int index =0, lastDigit=0;
        while(number !=0)
        {
            lastDigit = number % 10;
            digits[index] = lastDigit;
            number = number/10;
            index +=1;
            if(maxDigit ==  index)
            {
                break;
            }
        }
        int largestNum =0;
        int secondLargestNum = 0;
        for(int i=0; i< (maxDigit -1); i++)
        {
            if (digits[i] > largestNum)
            {
                secondLargestNum = largestNum;
                largestNum = digits[i];
            }
            else if (digits[i] > secondLargestNum && digits[i] != largestNum)
            {
                secondLargestNum = digits[i];
            }
        }
        System.out.println("The Largest digit is: " + largestNum);
        System.out.println("The Second largest digit is: " + secondLargestNum);
    }
}
