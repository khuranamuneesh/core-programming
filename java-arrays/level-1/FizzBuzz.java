import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        String[] array = new String[number];
        for (int i = 0; i < number; i++)
        {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0)
            {
                array[i] = "FizzBuzz";
            }
            else if ((i + 1) % 3 == 0)
            {
                array[i] = "Fizz";
            }
            else if ((i + 1) % 5 == 0)
            {
                array[i] = "Buzz";
            }
            else
            {
                array[i] = String.valueOf(i + 1);
            }
        }

        for(int j=0; j< array.length;j++)
            {
                System.out.print(array[j] + " ");
            }

    }
}
