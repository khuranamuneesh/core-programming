import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the unit price: ");
        float unitPrice = input.nextFloat();
        System.out.print("Enter the quantity to be bought: ");
        float itemQuantity = input.nextFloat();
        float totalPrice = unitPrice * itemQuantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + itemQuantity + " and unit price is INR " + unitPrice);

    }
}
