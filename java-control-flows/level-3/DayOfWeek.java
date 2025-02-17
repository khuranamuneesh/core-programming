import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Date: ");
        int d = input.nextInt();
        System.out.print("Enter the Month: ");
        int m = input.nextInt();
        System.out.print("Enter the Year: ");
        int y= input.nextInt();

        int ynot = y - (14 - m)/12;
        int x = ynot + ynot/4 + ynot/400 -ynot/100;
        int mnot = m + 12 * ((14-m)/12) - 2;
        int dnot = (d + x + 31*mnot/12) % 7;

        switch (dnot)
        {
            case 0:
                System.out.println("Sunday " + dnot);
                break;
            case 1:
                System.out.println("Monday " + dnot);
                break;
            case 2:
                System.out.println("Tuesday " + dnot);
                break;
            case 3:
                System.out.println("Wednesday " + dnot);
                break;
            case 4:
                System.out.println("Thursday "  + dnot);
                break;
            case 5:
                System.out.println("Friday "  + dnot);
                break;
            case 6:
                System.out.println("Saturday " + dnot);
                break;
        }
    }
}
