import java.util.Scanner;

public class MaximumTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0.0;
        double[] array = new double[10];
        for(int i=0; i<10; i++)
        {
            array[i] = input.nextDouble();
            if(array[i] <= 0)
            {
                break;
            }
            sum+= array[i];
        }
        System.out.println("Total sum: " + sum);
    }
}
