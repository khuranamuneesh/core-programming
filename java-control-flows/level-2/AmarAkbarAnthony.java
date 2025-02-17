import java.util.Scanner;

public class AmarAkbarAnthony {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's Height in cm: ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's Height in cm: ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's Height in cm: ");
        double anthonyHeight = input.nextDouble();

        if((amarAge <= akbarAge) && (amarAge <= anthonyAge))
        {
            System.out.println("Youngest Friend: Amar" );
        }
        else if ((akbarAge <= amarAge) && (akbarAge <= anthonyAge))
        {
            System.out.println("Youngest Friend : Akbar");
        }
        else
        {
            System.out.println("Youngest Friend: Anthony");
        }

        if((amarHeight >= akbarHeight) && (amarAge >= anthonyHeight))
        {
            System.out.println("Tallest Friend: Amar" );
        }
        else if ((akbarHeight >= amarHeight) && (akbarAge >= anthonyHeight))
        {
            System.out.println("Tallest Friend : Akbar");
        }
        else
        {
            System.out.println("Tallest Friend: Anthony");
        }
    }
}
