import java.util.Scanner;

public class MultiplicationFromSixToNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] result = new int[4];
        for(int i=0; i<4; i++){
            result[i] = (i+6) * number;
        }
        for(int j=0; j<4; j++){
            System.out.println(number + " * " + (j+6) + " = " + result[j]);
        }
    }
}
