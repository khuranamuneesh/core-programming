import java.util.Scanner;

public class UnitConverterKmToMiles
{
    public static class UnitConverter
    {
        public static double convertKmToMiles(double km)
        {
            double km2miles = 0.621371;
            km2miles = km2miles * km;
            return km2miles;
        }
        public static double convertMilesToKm(double miles)
        {
            double miles2km = 1.60934;
            miles2km = miles2km * miles;
            return miles2km;
        }
        public static double convertMetersToFeet(double meters)
        {
            double meters2feet = 3.28084;
            meters2feet = meters2feet * meters;
            return meters2feet;
        }
        public static double convertFeetToMeters(double feet)
        {
            double feet2meters = 0.3048;
            feet2meters = feet2meters * feet;
            return feet2meters;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();
        System.out.println("The distance in miles: " +  UnitConverter.convertKmToMiles(km));

        System.out.print("Enter the distance in miles: ");
        double miles = input.nextDouble();
        System.out.println("The distance in kilometers: " +  UnitConverter.convertKmToMiles(miles));

        System.out.print("Enter the distance in meters: ");
        double meters = input.nextDouble();
        System.out.println("The distance in feets: " +  UnitConverter.convertMetersToFeet(meters));

        System.out.print("Enter the distance in feet: ");
        double feet = input.nextDouble();
        System.out.println("The distance in meters: " +  UnitConverter.convertFeetToMeters(feet));
    }
}
