import java.util.Scanner;

public class PhysicsChemistryMaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        int[] physicsMarks = new int[number];
        int[] chemistryMarks = new int[number];
        int[] mathsMarks = new int[number];
        double[] percentages = new double[number];
        String[] grades = new String[number];
        for(int i=0; i<number; i++)
        {
            System.out.println("Enter the physics, chemistry and math marks for " + (i+1) + " student: ");
            physicsMarks[i] = input.nextInt();
            chemistryMarks[i] = input.nextInt();
            mathsMarks[i] = input.nextInt();
            while(physicsMarks[i] <0 || chemistryMarks[i]<0 || mathsMarks[i]<0)
            {
                System.out.println("Enter the values again: ");
                physicsMarks[i] = input.nextInt();
                chemistryMarks[i] = input.nextInt();
                mathsMarks[i] = input.nextInt();
            }
        }
        for(int i=0; i<number;i++)
        {
            percentages[i] = (double) (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i])/3;
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

        System.out.print("The physics marks are as follows: ");
        for(int elements: physicsMarks)
        {
            System.out.print(elements + " ");
        }
        System.out.println();
        System.out.print("The chemistry marks are as follows: ");
        for(int elements: chemistryMarks)
        {
            System.out.print(elements + " ");
        }
        System.out.println();
        System.out.print("The maths marks are as follows: ");
        for(int elements: mathsMarks)
        {
            System.out.print(elements + " ");
        }
        System.out.println();
        System.out.print("The Percentages of student are as follows: ");
        for(double elements: percentages)
        {
            System.out.print(elements + " ");
        }
        System.out.println();
        System.out.println("The grades are as follows: ");
        for(String elements: grades)
        {
            System.out.println(elements + " ");
        }
    }
}
