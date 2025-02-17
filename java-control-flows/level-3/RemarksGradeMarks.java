import java.util.Scanner;

public class RemarksGradeMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Physics Marks: ");
        int physicsMarks = input.nextInt();
        System.out.print("Enter the Maths Marks: ");
        int mathsMarks = input.nextInt();
        System.out.print("Enter the Chemistry Marks: ");
        int chemistryMarks = input.nextInt();
        float totalMarks = physicsMarks + mathsMarks+ chemistryMarks;
        float averageMarks = totalMarks/3.0F;
        if(averageMarks > 80)
        {
            System.out.println("Average Marks: " + averageMarks);
            System.out.println("Grade-A");
            System.out.println("Remarks: Level-4, above agency-normalised standards");
        }
        else if (averageMarks >=70 && averageMarks <=79)
        {
            System.out.println("Average Marks: " + averageMarks);
            System.out.println("Grade-B");
            System.out.println("Remarks: Level-3, at agency-normalised standards");
        }
        else if (averageMarks >=60 && averageMarks <=69)
        {
            System.out.println("Average Marks: " + averageMarks);
            System.out.println("Grade-C");
            System.out.println("Remarks: Level-2, below,but approaching agency-normalised standards");
        }
        else if (averageMarks >=50 && averageMarks <=59)
        {
            System.out.println("Average Marks: " + averageMarks);
            System.out.println("Grade-D");
            System.out.println("Remarks: Level-1, well-below agency-normalised standards");
        }
        else if (averageMarks >=40 && averageMarks <=49)
        {
            System.out.println("Average Marks: " + averageMarks);
            System.out.println("Grade-E");
            System.out.println("Remarks: Level-1, too below agency-normalised standards");
        }
        else
        {
            System.out.println("Average Marks: " + averageMarks);
            System.out.println("Grade-R");
            System.out.println("Remarks: Remedial standards");
        }

    }
}
