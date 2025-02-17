import java.util.Scanner;

public class MultiplesTillHundred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(number < 100){
            System.out.print("The multiples of " + number + " below 100 are: ");
            for(int i=99; i>=1; i--)
            {
               if(i % number ==0)
               {
                   System.out.print(" " + i);
               }

            }
        }
        else{
            System.out.println("No multiples below 100");
        }
    }
}
