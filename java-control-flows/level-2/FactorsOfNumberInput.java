import java.util.Scanner;

public class FactorsOfNumberInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("The factors are: ");
        for(int i=1; i<number;i++){
            if(number % i ==0)
            {
                System.out.print(" "+ i);
            }
        }

    }
}
