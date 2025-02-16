import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the perimeter of square: ");
        float squarePerimeter = input.nextFloat();
        float side = squarePerimeter/4F;
        System.out.println("The length of the side is " + side + " whose perimeter is " + squarePerimeter);
    }
}
