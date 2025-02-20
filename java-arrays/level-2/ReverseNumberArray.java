import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        int count =0, lastDigit=0;
        int originalNumber = number;
        while(originalNumber !=0)
        {
            originalNumber = originalNumber/10;
            count +=1;
        }
        int[] array = new int[count];
        int index=count-1;
        while(number !=0)
        {
            lastDigit = number % 10;
            array[index] = lastDigit;
            index--;
            number = number/10;
        }
        System.out.print("The array is: " );
        for(int elements: array)
        {
            System.out.print(elements + " ");
        }
        int[] reverseArray = new int[array.length];
        int newIndex=0;
        for(int i= (array.length-1); i >=0; i--)
        {
            reverseArray[newIndex] = array[i];
            newIndex++;
        }
        System.out.println();
        System.out.print("The reverse array is: " );
        for(int elements: reverseArray)
        {
            System.out.print(elements + " ");
        }
    }
}
