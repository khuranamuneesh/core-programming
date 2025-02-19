import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] oddArray = new int[number/2 + 1];
        int[] evenArray = new int[number/2 +1];
        int oddIndex=0, evenIndex =0;
        if(number <=0 ) //natural numbers range from 1 to +infinity
        {
            System.out.println("Error");
            System.exit(0);
        }
        else
        {
            for(int i=1; i<=number;i++)
            {
                if(i % 2 ==0)
                {
                    evenArray[evenIndex] = i;
                    evenIndex++;
                }
                else
                {
                    oddArray[oddIndex] = i;
                    oddIndex++;
                }
            }

            System.out.print("Odd Numbers: ");
            for(int i=0; i<oddIndex; i++)
            {
                System.out.print( oddArray[i] + " ");
            }

            System.out.println();

            System.out.print("Even Numbers: ");
            for(int i=0; i<evenIndex; i++)
            {
                System.out.print(evenArray[i] + " ");
            }
        }
    }
}
