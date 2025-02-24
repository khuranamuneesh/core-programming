import java.util.Scanner;

public class UnitConverterFahrenheitToCelsius
{
    public static class UnitConverter {
        public static double convertFahrenheitToCelsius(double farhenheit) {
            double fahrenheit2celsius = (farhenheit - 32) * 5 / 9;
            return fahrenheit2celsius;
        }

        public static double convertCelsiusToFahrenheit(double celsius) {
            double celsius2fahrenheit = (celsius * 9 / 5) + 32;
            return celsius2fahrenheit;
        }

        public static double convertPoundsToKiloGrams(double pounds) {
            double pounds2kilograms = 0.453592;
            pounds2kilograms *= pounds;
            return pounds2kilograms;
        }

        public static double convertKilogramsToPound(double kg) {
            double kilograms2pounds = 2.20462;
            kilograms2pounds *= kg;
            return kilograms2pounds;
        }

        public static double convertGallonsToLitres(double litres) {
            double gallons2liters = 3.78541;
            gallons2liters *= litres;
            return gallons2liters;
        }

        public static double convertLitresToGallons(double gallons) {
            double liters2gallons = 0.264172;
            liters2gallons *= gallons;
            return liters2gallons;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Temperature in Fahrenheit: ");
        double tempF = input.nextDouble();
        System.out.println("The temperature in Celsius: " +  UnitConverter.convertFahrenheitToCelsius(tempF));

        System.out.print("Enter the Temperature in Celsius: ");
        double tempC = input.nextDouble();
        System.out.println("The temperature in Fahrenheit: " +  UnitConverter.convertCelsiusToFahrenheit(tempC));

        System.out.print("Enter the weight in Pounds: ");
        double pound = input.nextDouble();
        System.out.println("The weight in Kilograms: " +  UnitConverter.convertPoundsToKiloGrams(pound));

        System.out.print("Enter the volume in Litres: ");
        double litres = input.nextDouble();
        System.out.println("The volume in gallons: " +  UnitConverter.convertLitresToGallons(litres));

        System.out.print("Enter the volume in Gallons: ");
        double gallons = input.nextDouble();
        System.out.println("The volume in Litres: " +  UnitConverter.convertGallonsToLitres(gallons));
    }
}
