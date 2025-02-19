import java.util.Scanner;

public class VotingChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentAge = new int[10];

        for(int i=0; i<10;i++)
        {
            System.out.print("Enter the age of student" + (i+1) + ": ");
            studentAge[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if(studentAge[i] >=18)
            {
                System.out.println("The student with the age " + studentAge[i] + " can vote");
            }
            else if (studentAge[i] <0)
            {
                System.out.println("Invalid Age");
            }
            else
            {
                System.out.println("The student with the age " + studentAge[i] + " cannot vote");
            }
        }

    }
}
