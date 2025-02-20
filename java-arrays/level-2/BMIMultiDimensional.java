import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        double [][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for(int i=0; i<number; i++)
        {
            System.out.println("Enter the weight and height respectively for " + (i+1) + " person: ");
            for(int j=0; j<2; j++)
            {
                personData[i][j] = input.nextDouble();
                while(personData[i][j] <=0)
                {
                    System.out.print("Enter the values again: ");
                    personData[i][j] = input.nextDouble();
                }
            }
            personData[i][2] = (personData[i][0])/ ((personData[i][1]/100) * (personData[i][1]/100)); //bmi calculation
        }

        for(int i=0; i<number; i++)
        {
            if(personData[i][2] >= 40.0)
            {
                weightStatus[i] = "Obese";
            }
            else if ( personData[i][2] >=25.0 && personData[i][2] <= 39.9)
            {
                weightStatus[i] = "Overweight";
            }
            else if ( personData[i][2] >=18.5 && personData[i][2] <= 24.9)
            {
                weightStatus[i] = "Normal";
            }
            else
            {
                weightStatus[i] = "Underweight";
            }
        }
        for(int i=0; i<number; i++)
        {
            System.out.print("The weight, height and BMI of " + (i+1) + " person respectively is: ");
            for(int j=0; j<3;j++)
            {
                System.out.print(personData[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("The weight status is as follows: ");
        for(String elements: weightStatus)
        {
            System.out.print(elements + " ");
        }
    }
}
