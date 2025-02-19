import java.util.Scanner;

public class TwoDArrayToOneDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = input.nextInt();
        System.out.print("Enter the column: ");
        int column = input.nextInt();
        int[][] multiArray = new int[row][column];
        int product = row * column;
        int index=0;
        int[] oneArray = new int[product];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column;j++)
            {
                System.out.print("Enter the elemnt for " + (i+1) + " row and " + (j+1) + " column of array: " );
                multiArray[i][j] = input.nextInt();
                oneArray[index] = multiArray[i][j];
                index +=1;
            }
        }
        System.out.println();
        System.out.print("Elements of 1 D array are: ");
        for(int j=0; j<product; j++)
        {
            System.out.print(oneArray[j] + " ");
        }

    }
}
