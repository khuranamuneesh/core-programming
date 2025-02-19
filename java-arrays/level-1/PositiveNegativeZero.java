import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] userArray = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the element " + (i + 1) + " of array: ");
            userArray[i] = input.nextInt();
        }
        for (int j = 0; j < 5; j++) {
            if (userArray[j] > 0) {
                System.out.print("Positive Number: ");
                if (userArray[j] % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else if (userArray[j] == 0) {
                System.out.println("Zero");
            } else {
                System.out.println("Negative");
            }

        }
        if (userArray[0] > userArray[4]) {
            System.out.println("First element is greater than the last one");
        } else if (userArray[0] == userArray[4]) {
            System.out.println("They are equal");
        } else {
            System.out.println("First element is lesser than the last one");
        }
    }
}
