import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int userInput = input.nextInt();
        System.out.print("The factors are: ");
        for(int i=0; i< factors(userInput).length; i++)
        {
            System.out.print(factors(userInput)[i] + " ");
        }
        System.out.println();
        System.out.println("The sum of factors are: " + factorsSum(factors(userInput)));
        System.out.println("The product of factors are: " + factorsProduct(factors(userInput)));
        System.out.println("The sum of squares of factors are: " + factorsSquaresSum(factors(userInput)));

    }

    public static int[] factors(int n)
    {
        int count =0;
        for(int i=1; i<=n; i++ )
        {
            if(n % i ==0)
            {
                count +=1;
            }
        }
        int[] array = new int[count];
        int index =0;
        for(int i=1; i<= n; i++ )
        {
            if(n % i ==0)
            {
                array[index] = i;
                index++;
            }
        }
        return array;
    }

    public static int factorsSum(int[] array)
    {
        int sum=0;
        for(int i=0; i<array.length;i++)
        {
            sum += array[i];
        }
        return sum;
    }

    public static int factorsProduct(int[] array)
    {
        int product=1;
        for(int i=0; i<array.length;i++)
        {
            product *= array[i];
        }
        return product;
    }

    public static int factorsSquaresSum(int[] array)
    {
        int squaresSum = 0;
        for(int i=0; i<array.length;i++)
        {
            squaresSum += (int)Math.pow(array[i],2.0D);
        }
        return squaresSum;
    }


}
