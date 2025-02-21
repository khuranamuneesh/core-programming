import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the angle in degree: ");
        double angle = input.nextDouble();
        System.out.println("The sine value of " + angle + " is: " + calculateTrigonometricFunctions(angle)[0]);
        System.out.println("The cosine value of " + angle + " is: " + calculateTrigonometricFunctions(angle)[1]);
        System.out.println("The tangent value of " + angle + " is: " + calculateTrigonometricFunctions(angle)[2]);
    }
    public static double[] calculateTrigonometricFunctions(double angle)
    {
        double radianAngle = Math.toRadians(angle);
        double sineValue = Math.sin(radianAngle);
        double cosineValue = Math.cos(radianAngle);
        double tangentValue = Math.tan(radianAngle);
        double[] values = {sineValue,cosineValue,tangentValue};
        return values;

    }
}
