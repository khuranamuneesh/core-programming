import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args)
    {
        WindChillTemperature obj = new WindChillTemperature(); //created an object of windchilltemperatue class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temp = input.nextDouble();
        System.out.print("Enter the Wind speed: ");
        double windSpeed = input.nextDouble();
        System.out.println("The Wind Chill Temperature is: " +  obj.calculateWindChill(temp,windSpeed));
    }
    public double calculateWindChill(double temperature, double windSpeed)
    {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
        return  windChill;
    }
}
