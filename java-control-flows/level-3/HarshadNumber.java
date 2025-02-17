import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int sum=0;
        int lastDigit;
        while(number != 0){
            lastDigit = number % 10;
            sum += lastDigit;
            number = number/10;
        }
        if(originalNumber % sum ==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not a Harshad Number");
        }
    }
}
