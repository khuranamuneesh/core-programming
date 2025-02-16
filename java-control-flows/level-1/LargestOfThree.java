import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        boolean isFirstLargest = false, isSecondLargest = false, isThirdLargest = false;
        if(number1 >= number2 && number1 >= number3){
            isFirstLargest = true;
        } else if (number2 >= number1 && number2 >= number3) {
            isSecondLargest = true;
        }  else {
            isThirdLargest = true;
        }
        System.out.println("Is the first number the largest? " + isFirstLargest + "\n"+
                "Is the second number the largest? " + isSecondLargest + "\n" +
                "Is the third number the largest? " + isThirdLargest + "\n");
    }
}
