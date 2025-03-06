import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] studentAge = new int[10];
        for(int i=0; i< studentAge.length; i++)
        {
            System.out.println("Enter the age of " + (i+1) + " Student: ");
            studentAge[i] = input.nextInt();
        }
        for(int i=0; i< studentAge.length;i++)
        {
            canStudentVote(studentAge[i]);
            print(canStudentVote(i));
        }



    }
    public static boolean canStudentVote(int age)
    {
        if(age < 0)
        {
            print(false);
            return false;
        }
        else if (age >= 18)
        {
            print(true);
            return true;
        }
        else
        {
            print(false);
            return false;
        }
    }

    public static void print(boolean value)
    {
        if(value)
        {
            System.out.println("Student cannot vote");
        }
        else
        {
            System.out.println("Student cannot vote");
        }
    }
}
