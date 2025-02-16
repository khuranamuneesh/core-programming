import java.util.Scanner;

public class SixNineMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        for(int i =6; i<=9; i++){
            int product = i * number;
            System.out.println(number + " * " + i + " = " + product);
        }
    }
}
