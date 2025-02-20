import java.util.Scanner;

public class FrequencyDigitsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int count =0;
        int lastDigit;
        int index =0;
        while(originalNumber != 0)
        {
            originalNumber = originalNumber/10;
            count++;
        }
        int[] array = new int[count];
        while (number != 0)
        {
            lastDigit = number % 10;
            array[index] = lastDigit;
            number = number/10;
            index++;
        }
        System.out.println("The array is: ");
        for(int elements: array)
        {
            System.out.print(elements + " ");
        }
        System.out.println();
        int[] frequencyArray = new int[10];

        for(int i=0; i< array.length; i++)
        {
            int element = array[i];
            int frequency =0;
            for(int k=0; k< array.length;k++)
            {
                if(array[k] == element)
                {
                    frequency +=1;
                }
            }
            frequencyArray[i] = frequency;
        }
        for(int i=0; i < array.length; i++)
        {
            System.out.println("The frequency of " + (i+1) + " element of array i.e., " + array[i] + " is: " + frequencyArray[i]);
        }
    }
}
