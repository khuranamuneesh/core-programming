import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of person: ");
        int numberOfPerson = input.nextInt();
        double[] weight = new double[numberOfPerson];
        double[] height = new double[numberOfPerson];
        double[] bmi = new double[numberOfPerson];
        String[] bmiStatus = new String[numberOfPerson];
        for(int i=0; i<numberOfPerson; i++)
        {
            System.out.print("Enter the weight of " + (i+1) + " person: ");
            weight[i] = input.nextDouble();
            System.out.print("Enter the height of " + (i+1) + " person in cm: ");
            height[i] = input.nextDouble();
            height[i] = height[i] /100;
            bmi[i] = weight[i]/ (height[i] * height[i]);
        }
        System.out.print("The BMI values are as follows: ");
        for(double elements: bmi)
        {
            System.out.print(elements + " ");
        }
        for(int i=0; i<numberOfPerson; i++)
        {
            if(bmi[i] >= 40.0)
            {
                bmiStatus[i] = "Obese";
            }
            else if ( bmi[i] >=25.0 && bmi[i] <= 39.9)
            {
                bmiStatus[i] = "Overweight";
            }
            else if ( bmi[i] >=18.5 && bmi[i] <= 24.9)
            {
                bmiStatus[i] = "Normal";
            }
            else
            {
                bmiStatus[i] = "Underweight";
            }
        }
        System.out.println();
        System.out.print("The BMI Status is as follows: ");
        for(String elements: bmiStatus)
        {
            System.out.print(elements + " ");
        }
    }
}
