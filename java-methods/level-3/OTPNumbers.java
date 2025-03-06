public class OTPNumbers {
    public static void main(String[] args)
    {
        int[] otpArray = generateOTP();
        System.out.println("The OTP's are: ");
        for(int elements: otpArray)
        {
            System.out.print(elements + " ");
        }
        System.out.println();
        if(isUnique(otpArray))
        {
            System.out.println("The elements are not unique");
        }
        else
        {
            System.out.println("The elements are unique");
        }

    }
    public static int[] generateOTP()
    {
        int[] array = new int[10];
        for(int i=0; i< array.length; i++)
        {
            array[i] = (int) (Math.random() * 900000) + 100000;
        }
        return array;
    }
    public static boolean isUnique(int[] array)
    {
        boolean isUnique = false;
        for(int i=0; i< array.length-1; i++)
        {
            if(array[i] == array[i+1])
            {
                isUnique = true;
                break;
            }
        }
        return isUnique;
    }
}
