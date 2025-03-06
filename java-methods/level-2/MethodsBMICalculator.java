import java.util.Scanner;

public class MethodsBMICalculator{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[][] userData = new double[10][3];
        for(int i=0; i<10;i++)
        {
            System.out.print("Enter the weight of " + (i+1) + " Person: ");
            userData[i][0] = input.nextDouble();
            System.out.print("Enter the height of " + (i+1) + " Person in cm: ");
            userData[i][1] = input.nextDouble();
        }
        populateArray(userData);
        for(int i=0; i<10;i++)
        {
            BMIStatus(userData[i][2]);
        }
    }
    public static double BMIValue(double num1, double num2)
    {
        num2 = num2/100;
        double bmiValue = num1/(num2*num2);
        return bmiValue;
    }
    public static void populateArray(double[][] array)
    {
        for(int j=0; j< array.length;j++)
        {
            array[j][2] = BMIValue(array[j][0], array[j][1]);
            System.out.println("The BMI value of " + (j+1) + " Person is: " + array[j][2] );
        }

    }
    public static void BMIStatus(double value)
    {
        if( value >= 40.0)
        {
            System.out.println("Obese");
        }
        else if ( value >= 25.0 && value <= 39.9)
        {
            System.out.println("Overweight");
        }
        else if ( value >= 18.5 && value <= 24.9)
        {
            System.out.println("Normal");
        }
        else if ( value <= 18.4)
        {
            System.out.println("Underweight");
        }
    }

}
