import java.util.Scanner;

public class TriangleAreaInchCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base length in cm: ");
        double cmBase = input.nextDouble();
        System.out.print("Enter the height length in cm: ");
        double cmHeight = input.nextDouble();
        double inchBase = cmBase/2.54;
        double inchHeight = cmHeight/2.54;
        double areaTriangleCmSquare = (cmBase * cmHeight)/2;
        double areaTriangleInchSquare = (inchBase * inchHeight)/2;
        System.out.println("The area of triangle in square inches is " + areaTriangleInchSquare + " and in square cm is " + areaTriangleCmSquare);

    }
}
