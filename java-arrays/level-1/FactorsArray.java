import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int maxFactor=number/2;
        int[] factors = new int[maxFactor]; //index start from zero to 9
        int index =0;
        for(int i=1; i<=number;i++)
        {
            if(number % i ==0)
            {
                factors[index] = i;
                index += 1;
            }
        }

        for(int j=0; j<index;j++){
            System.out.print(factors[j] + " ");
        }
    }
}
