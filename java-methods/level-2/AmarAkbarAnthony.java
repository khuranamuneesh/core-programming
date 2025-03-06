import java.util.Scanner;

public class AmarAkbarAnthony {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        String[] name = {"Amar", "Akbar", "Anthony"};
        for(int i=0; i< age.length; i++)
        {
            System.out.print("Enter the age of " + name[i]);
            age[i] = input.nextInt();
        }
        for(int i=0; i< height.length; i++)
        {
            System.out.print("Enter the age of " + name[i]);
            height[i] = input.nextInt();
        }
        YoungestOfThree(age[0],age[1],age[2]);
        TallestOfThree(height[0],age[1],age[2]);
    }

    public static void YoungestOfThree(int age1, int age2, int age3)
    {
        if(age1 <= age2 && age1 <= age3)
        {
            System.out.println("Amar is the youngest");
        }
        else if (age2 <= age1 && age2 <= age3)
        {
            System.out.println("Akbar is the youngest");
        }
        else
        {
            System.out.println("Anthony is the youngest");
        }
    }

    public static void TallestOfThree(int height1, int height2, int height3)
    {
        if(height1 >= height2 && height1 >= height3)
        {
            System.out.println("Amar is the Tallest");
        }
        else if (height2 >= height1 && height2 >= height3)
        {
            System.out.println("Akbar is the Tallest");
        }
        else
        {
            System.out.println("Anthony is the Tallest");
        }
    }
}
