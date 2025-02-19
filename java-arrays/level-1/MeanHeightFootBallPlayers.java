import java.util.Scanner;

public class MeanHeightFootBallPlayers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum =0.0;
        for(int i=0; i< heights.length;i++){
            System.out.print("Enter the height of " + (i+1) + " player: " );
            heights[i] = input.nextDouble();
            sum += heights[i];
        }
        double mean = sum/ heights.length;
        System.out.println("The mean is: " + mean);

    }
}
