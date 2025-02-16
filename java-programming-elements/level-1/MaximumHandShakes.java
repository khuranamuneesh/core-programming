import java.util.Scanner;

public class MaximumHandShakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int numberOfStudents = input.nextInt();
        int maxNumberOfHandShakes = (numberOfStudents * (numberOfStudents -1))/2;
        System.out.println("The number of possible handshakes is: " + maxNumberOfHandShakes);
    }
}
