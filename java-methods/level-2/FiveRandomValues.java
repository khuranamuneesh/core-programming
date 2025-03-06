import java.util.Scanner;

public class FiveRandomValues {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of digits: ");
        int digitSize = input.nextInt();
        FiveRandomValues obj = new FiveRandomValues();
        int[] digitArray = obj.generate4DigitRandomArray(digitSize);
        System.out.print("The array is: ");
        for(int elements: digitArray)
        {
            System.out.print(elements + " ");
        }
        double[] arrayData = obj.findAverageMinMax(digitArray);
        System.out.println();
        System.out.println("The average of elements of array is: " + arrayData[0]);
        System.out.println("The maximum of elements in array is: " + arrayData[1]);
        System.out.println("The minimum of elements in array is: " + arrayData[2]);

    }
    public int[] generate4DigitRandomArray(int size)
    {
        int[] array = new int[5];
        for(int i=0; i< array.length; i++)
        {
            int num =0;
            while(num < 1000 || num > 9999 )
            {
                num = (int)(Math.random() * 9999) + 1 ;
            }
            array[i] = num;
        }
        return array;
    }
    public double[] findAverageMinMax(int[] numbers)
    {
        double[] array = new double[numbers.length];
        double sum =0;
        for(int i=0; i< numbers.length; i++)
        {
            sum += numbers[i];
        }
        double average = sum/ numbers.length;
        array[0] = average;
        double keyElement = Integer.MIN_VALUE;
        double maxNum =0;
        for(int i=0; i< numbers.length; i++)
        {
            if(numbers[i] > keyElement)
            {
                maxNum = numbers[i];
                keyElement = numbers[i];
            }
        }
        array[1] = maxNum;
        keyElement = Integer.MAX_VALUE;
        double minNum = 0;
        for(int i=0; i< numbers.length; i++)
        {
            if(numbers[i] < keyElement)
            {
                minNum = numbers[i];
                keyElement = numbers[i];
            }
        }
        array[2] = minNum;
        return array;
    }
}
