import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a = input.nextInt();
        System.out.print("Enter the second integer: ");
        int b = input.nextInt();
        System.out.print("Enter the third integer: ");
        int c = input.nextInt();
        int operation1 = a + b *c; //left to right --> multiplication first and then addition
        int operation2 = a * b + c; //left to right --> multiplication first and then addition
        int operation3 = c + a / b; //left to right --> division first and then addition
        int operation4 = a % b + c; //left to right --> modulus operator first and then addition
        System.out.println("The result of a+b*c operation is: " + operation1);
        System.out.println("The result of a*b+c operation is: " + operation2);
        System.out.println("The result of c+a/b operation is: " + operation3);
        System.out.println("The result of a%b+c operation is: " + operation4);
    }
}
