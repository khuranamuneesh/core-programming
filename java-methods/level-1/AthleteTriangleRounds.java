import java.util.Scanner;

public class AthleteTriangleRounds {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side of a triangle in meters: ");
        int side1 = input.nextInt();
        System.out.print("Enter the second side of a triangle in meters: ");
        int side2 = input.nextInt();
        System.out.print("Enter the third side of a triangle in meters: ");
        int side3 = input.nextInt();
        System.out.println("The rounds that the athlete must run to complete 5 km is: "+ numberOfRounds(side1,side2,side3));
    }

    public static int numberOfRounds(int a, int b, int c)
    {
        int perimeter = a+b+c;
        double rounds = 5000.0D/perimeter;
        int value = (int) Math.ceil(rounds); //done this so that the distance covered will be at least 5000 km
        return value;
    }

}
