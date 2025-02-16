import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        double a = input.nextDouble();
        System.out.print("Enter the second integer: ");
        double b = input.nextDouble();
        System.out.print("Enter the third integer: ");
        double c = input.nextDouble();
        double operation1 = a + b *c; //left to right --> multiplication first and then addition
        double operation2 = a * b + c; //left to right --> multiplication first and then addition
        double operation3 = c + a / b; //left to right --> division first and then addition
        double operation4 = a % b + c; //left to right --> modulus operator first and then addition
        System.out.println("The result of a+b*c operation is: " + operation1);
        System.out.println("The result of a*b+c operation is: " + operation2);
        System.out.println("The result of c+a/b operation is: " + operation3);
        System.out.println("The result of a%b+c operation is: " + operation4);
    }
}
