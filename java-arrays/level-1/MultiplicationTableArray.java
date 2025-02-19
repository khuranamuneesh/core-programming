import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] result = new int[10];
        for(int i=0; i<10; i++){
            result[i] = (i+1) * number;
        }
        for(int j=0; j<10; j++){
            System.out.println(number + " * " + (j+1) + " = " + result[j]);
        }
    }
}
