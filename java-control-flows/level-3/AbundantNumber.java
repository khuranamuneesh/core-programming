import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        int sum=0;
        for(int i=1; i<number;i++){
            if(number % i==0)
                {
                    sum += i;
                }
        }
        if(sum > number)
        {
            System.out.println("Abundant Number and the sum is: " + sum);
        }
        else{
            System.out.println("Not Abundant Number and the sum is: " + sum);
        }
    }
}
