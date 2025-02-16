import java.util.Scanner;

public class CountDownForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = input.nextInt();
        System.out.println("The countdown begins..........");
        for(int i = userInput; i>=1; i--){
            System.out.println(i);
        }
    }
}
