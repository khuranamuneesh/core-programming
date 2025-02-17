import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int count = 0;
        while(originalNumber != 0)
        {
            originalNumber = originalNumber/10; //original number will be integer part of one-tenth
            count = count+1;
        }
        System.out.println("The number of digits in " + number + " is: " + count);
    }
}
