import java.util.Scanner;

public class LargestSecondLargestMaxDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int maxDigit=10;
        int[] digits = new int[maxDigit];
        int index =0, lastDigit=0;
        while(number !=0)
        {
            if(maxDigit ==  index)
            {
                maxDigit +=10;
                int[] tempArray = new int[maxDigit];
                System.arraycopy(digits,0, tempArray,0, digits.length);
                digits = tempArray;

            }
            lastDigit = number % 10;
            digits[index] = lastDigit;
            number = number/10;
            index +=1;

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
