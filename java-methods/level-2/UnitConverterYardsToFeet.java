import java.util.Scanner;

public class UnitConverterYardsToFeet {

    public static class UnitConverter {
        public static double convertYardsToFeet(double yards) {
            double yards2feet = 3;
            yards2feet *= yards;
            return yards2feet;
        }

        public static double convertFeetToYards(double feet) {
            double feet2yards = 0.333333;
            feet2yards *=  feet;
            return feet2yards;
        }

        public static double convertMetersToInches(double meters) {
            double meters2inches = 39.3701;
            meters2inches *= meters;
            return meters2inches;
        }

        public static double convertInchesToMeters(double Inches) {
            double inches2meters = 0.0254;
            inches2meters *= Inches;
            return inches2meters;
        }

        public static double convertInchesToCentiMeters(double Inches) {
            double inches2cm = 2.54;
            inches2cm *= Inches;
            return inches2cm;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in Yards: ");
        double yards = input.nextDouble();
        System.out.println("The distance in feet: " +  UnitConverter.convertYardsToFeet(yards));

        System.out.print("Enter the distance in Feet: ");
        double feet = input.nextDouble();
        System.out.println("The distance in yards: " +  UnitConverter.convertFeetToYards(feet));

        System.out.print("Enter the distance in Meters: ");
        double meters = input.nextDouble();
        System.out.println("The distance in inches: " +  UnitConverter.convertMetersToInches(meters));

        System.out.print("Enter the distance in Inches: ");
        double inches = input.nextDouble();
        System.out.println("The distance in meters: " +  UnitConverter.convertInchesToMeters(inches));

        System.out.print("Enter the distance in Inches: ");
        double inches2cm = input.nextDouble();
        System.out.println("The distance in meters: " +  UnitConverter.convertInchesToCentiMeters(inches2cm));
    }
}
