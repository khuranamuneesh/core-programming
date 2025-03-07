import java.util.Scanner;

public class ArrayIndexOutOfBoundsException
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();
        String[] names = new String[size];
        HandleArrayIndexOutOfBoundsException(names);
        GenerateArrayIndexOutOfBoundsException(names);
    }
    public static void GenerateArrayIndexOutOfBoundsException(String[] s1)
    {
        int number = 2 * s1.length;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the names of person: ");
        for(int i=0; i < number; i++)
        {
            s1[i] = in.next();
        }
    }
    public static void HandleArrayIndexOutOfBoundsException(String[] s1)
    {
        try
        {
            int number = 2 * s1.length;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the names of person: ");
            for(int i=0; i < number; i++)
            {
                s1[i] = in.next();
            }
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of Bounds exception message -" + e.getMessage());
        }

    }
}
