import java.util.Scanner;

public class CountDownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = input.nextInt();
        System.out.println("The countdown begins..........");
        while(userInput >= 1){
            System.out.println(userInput);
            userInput -=1;
        }

    }
}
