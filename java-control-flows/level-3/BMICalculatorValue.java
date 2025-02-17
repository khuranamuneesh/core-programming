import java.util.Scanner;

public class BMICalculatorValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Weight in kgs: ");
        double weight = input.nextDouble();
        System.out.println("Enter the Height in cms: ");
        double height = input.nextDouble();
        height = height/100;
        double BMIValue = weight/( height * height);
        if(BMIValue >= 40.0)
        {
            System.out.println("Obese");
        }
        else if (BMIValue >= 25.0 && BMIValue <= 39.9)
        {
            System.out.println("OverWeight");
        }
        else if (BMIValue >= 18.5 && BMIValue <= 24.9)
        {
            System.out.println("Normal");
        }
        else
        {
            System.out.println("Underweight");
        }
    }
}
