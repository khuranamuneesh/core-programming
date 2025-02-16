import java.util.Scanner;

public class HeightFootInch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Height: ");
        double userHeight = input.nextDouble();
        double inchHeight = userHeight/2.54;
        double footHeight = inchHeight/12;
        System.out.println("Your Height in cm is " + userHeight+ " while in feet is " + footHeight + " and inches is " + inchHeight);
    }
}
