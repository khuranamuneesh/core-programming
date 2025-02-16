import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = input.nextInt();
        boolean isDivisible = false;
        if(userInput % 5 == 0)
        {
            isDivisible =true;
        }
        System.out.println("Is the number " + userInput + " divisible by 5? " + isDivisible);
    }
}
