import java.util.Scanner;

public class AmarAkbarAnthonyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        int aIndex=0;
        int hIndex =0;
        String[] name = {"Amar", "Akbar", "Anthony"};
        for(int i=0; i<3; i++)
        {
            System.out.print("Enter the age for " + name[i] + ": " );
            age[i] = input.nextInt();
            System.out.print("Enter the height for " + name[i] + ": ");
            height[i] = input.nextInt();
        }
        for(int i=1;i<3; i++)
        {
            if(age[i] < age[aIndex])
            {
                aIndex = i;
            }
        }
        System.out.println("Youngest Friend is " + name[aIndex] + " with age: " + age[aIndex]);

        for(int i=1; i<3; i++)
        {
            if(height[i] > height[hIndex])
            {
                hIndex = i;
            }
        }
        System.out.println("Tallest Friend is " + name[hIndex] + " with height: " + height[hIndex]);
    }
}
