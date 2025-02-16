import java.util.Scanner;

public class YardFeetMile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in feets: ");
        double distanceFeet = input.nextDouble();
        double distanceYard = distanceFeet/3;
        double distanceMile = distanceYard/1760;
        System.out.println("The distance in yards is " + distanceYard + " and in miles is " + distanceMile + " for the distance provided in feet is " + distanceFeet);
    }
}
