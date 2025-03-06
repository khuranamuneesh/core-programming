import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("The format of the equation - ax^2+ bx + c ");
        System.out.print("Enter the value of 'a' : ");
        int num1 = input.nextInt();
        System.out.print("Enter the value of 'b' : ");
        int num2 = input.nextInt();
        System.out.print("Enter the value of 'c' : ");
        int num3 = input.nextInt();
        double[] array = rootsCalculate(num1, num2, num3);
        for(int i=0; i<2; i++)
        {
            if(array[i] == 0 && i ==1)
            {
                System.out.println("No more roots exist");
                break;
            }
            System.out.println("The root is: " + array[i] );

        }
    }
    public static double[] rootsCalculate(int a,int b, int c)
    {
        double[] rootsArray = {0,0};
        double delta = Math.pow(b,2.0 ) - (4 * a * c); //formula given in sheet is wrong
        if(delta > 0)
        {
            rootsArray[0] = (Math.sqrt(delta) -b )/ (2 * a);
            rootsArray[1] = ((-1 * Math.sqrt(delta)) -b )/ (2 * a);
        }
        else if (delta ==0)
        {
            rootsArray[0] = (-1.0D * b )/ (2.0 * a);
        }
        System.out.println("The value of delta is: " + delta);
        return rootsArray;
    }
}
