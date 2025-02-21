import java.util.Scanner;

public class MaximumHandshake {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.println("The maximum number handshakes among " + numberOfStudents + "number of students: " + handshakeCount(numberOfStudents));
    }

    public static int handshakeCount(int n)
    {
        int count = (n*(n-1))/2;
        return count;
    }
}
