import java.util.Scanner;

public class CollinearTriplePoints
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x co-ordinates for 1st Point: ");
        int x1 = input.nextInt();
        System.out.print("Enter the y co-ordinates for 1st Point: ");
        int y1 = input.nextInt();
        System.out.print("Enter the x co-ordinates for 2nd Point: ");
        int x2 = input.nextInt();
        System.out.print("Enter the y co-ordinates for 2nd Point: ");
        int y2 = input.nextInt();
        System.out.print("Enter the x co-ordinates for 3rd Point: ");
        int x3 = input.nextInt();
        System.out.print("Enter the y co-ordinates for 3rd Point: ");
        int y3 = input.nextInt();
        SlopeFormula(x1,y1,x2,y2,x3,y3);
        TriangleFormula(x1,y1,x2,y2,x3,y3);
    }
    public static void SlopeFormula(int x1, int y1, int x2, int y2, int x3,int y3)
    {
        double AB = (double)(y2 - y1)/(x2 - x1);
        double BC = (double)(y3 - y2)/(x3 - x2);
        double AC = (double)(y2 - y1)/(x2 - x1);
        if(AB == BC && BC == AC)
        {
            System.out.println("Points are collinear determined using slope formula");
        }
        else
        {
            System.out.println("Points are not collinear determined using slope formula");
        }
    }
    public static void TriangleFormula(int x1, int y1, int x2, int y2, int x3,int y3)
    {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        if(area == 0)
        {
            System.out.println("Points are collinear determined using triangle formula");
        }
        else
        {
            System.out.println("Points are not collinear determined using triangle formula");
        }
    }


}
