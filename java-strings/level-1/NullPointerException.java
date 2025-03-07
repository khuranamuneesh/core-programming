import java.lang.*;

public class NullPointerException {
    public static void main(String[] args)
    {
        GenerateNullPointerException();
    }
    public static void GenerateNullPointerException()
    {
        String text = null;
        try
        {
            System.out.println(text.toUpperCase());;
        }
        catch (java.lang.NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }


}
