import java.util.Scanner;

public class PCMMultiDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        int[][] studentData = new int[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];
        for(int i=0; i<number; i++)
        {
            System.out.println("Enter the physics, chemistry and maths mark of student" + (i+1));
            for(int j=0; j<3;j++)
            {
                studentData[i][j] = input.nextInt();
                while(studentData[i][j] <0)
                {
                    System.out.println("Enter the marks again: ");
                    studentData[i][j] = input.nextInt();
                }
                percentages[i] += studentData[i][j];
            }
            percentages[i] = percentages[i]/3;
        }
        for(int i=0; i<number;i++)
        {
            if(percentages[i] >= 80)
            {
                grades[i] = "A, Remarks: Level-4, above agency-normalised standards";
            }
            else if (percentages[i] >= 70 && percentages[i] <=79)
            {
                grades[i] = "B, Remarks: Level-3, at agency-normalised standards";
            }
            else if (percentages[i] >= 60 && percentages[i] <=69)
            {
                grades[i] = "C, Remarks: Level-2, below,but approaching agency-normalised standards";
            }
            else if (percentages[i] >= 50 && percentages[i] <=59)
            {
                grades[i] = "D, Remarks: Level-1, well-below agency-normalised standards";
            }
            else if (percentages[i] >= 40 && percentages[i] <=49)
            {
                grades[i] = "E, Remarks: Level-1, too below agency-normalised standards";
            }
            else
            {
                grades[i] = "R, Remarks: Remedial standards";
            }
        }
        System.out.println("The percentages are: ");
        for(double elements: percentages)
        {
            System.out.println(elements);
        }
        System.out.println();
        System.out.println("The grades are: ");
        for(String elements: grades)
        {
            System.out.println(elements);
        }
    }
}
