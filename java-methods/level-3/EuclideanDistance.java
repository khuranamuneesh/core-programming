import java.util.Scanner;

public class EuclideanDistance {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x co-ordinates for 1st Point: ");
        int x1 = input.nextInt();
        System.out.print("Enter the y co-ordinates for 1st Point: ");
        int y1 = input.nextInt();
        System.out.print("Enter the x co-ordinates for 2nd Point: ");
        int x2 = input.nextInt();
        System.out.print("Enter the y co-ordinates for 2nd Point: ");
        int y2 = input.nextInt();
        System.out.println("The euclidean distance between two points is: " + DistanceCalculation(x1,y1,x2,y2));
        double[] dataArray = EquationCalculation(x1,y1,x2,y2);
        System.out.println("The slope of line is " + dataArray[0]);
        System.out.println("The intercept of line is " + dataArray[1]);
        System.out.println("The equation of line:  y = " + dataArray[0] + " * x  + " +  dataArray[1]);
    }
    public static double DistanceCalculation(int x1, int y1, int x2, int y2)
    {
        double a = x2 -x1 ;
        a = Math.pow(a, 2);
        double b = y2 - y1;
        b = Math.pow(b, 2);
        double distance = Math.sqrt(a + b);
        return distance;
    }
    public static double[] EquationCalculation(int x1, int y1, int x2, int y2)
    {
        double[] array = {0,0};
        double m = (double) (y2 - y1) /(x2 -x1); //slope
        array[0] = m;
        double b = y1 - m * x1; //y-intercept
        array[1] = b;
        return array;
    }

}

