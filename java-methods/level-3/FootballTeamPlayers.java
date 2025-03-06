public class FootballTeamPlayers
{
    public static void main(String[] args)
    {
        int[] heights = new int[11];
        for(int i=0; i< heights.length; i++)
        {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        System.out.print("The Height of Players of Football Team is: ");
        for(int elements: heights)
        {
            System.out.print(elements + " ");
        }
        System.out.println();
        System.out.println("The Maximum height among Players is: " + TallestHeight(heights));
        System.out.println("The Minimum height among Players is: " + ShortestHeight(heights));
        System.out.println("The mean height among Players is: " + MeanHeight(heights));

    }
    public static double sumElements(int[] array)
    {
        double sum=0;
        for(int i=0; i< array.length; i++)
        {
            sum += array[i];
        }
        return sum;
    }
    public static double MeanHeight(int[] array)
    {
        double mean = sumElements(array)/ array.length;
        return mean;
    }
    public static int ShortestHeight(int[] array)
    {
        int keyElement = Integer.MAX_VALUE;
        int minHeight =0;
        for(int i=0; i< array.length;i++)
        {
            if(array[i] < keyElement)
            {
                minHeight = array[i];
                keyElement = array[i];
            }
        }
        return  minHeight;
    }
    public static int TallestHeight(int[] array)
    {
        int keyElement = Integer.MIN_VALUE;
        int maxHeight =0;
        for(int i=0; i< array.length;i++)
        {
            if(array[i] > keyElement)
            {
                maxHeight = array[i];
                keyElement = array[i];
            }
        }
        return  maxHeight;
    }
}
