public class PenDistribution {
    public static void main(String[] args) {
        int penNumber = 14;
        int studentNumber =3;
        int nonDistributedPen = penNumber % studentNumber;
        int penPerStudent = penNumber / studentNumber; //distribution of pen is a integer division
        System.out.println("The Pen Per Student is "+ penPerStudent + " and the remaining pen not distributed is " + nonDistributedPen);

    }
}
