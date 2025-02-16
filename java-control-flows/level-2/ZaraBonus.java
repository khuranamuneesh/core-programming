import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year of service: ");
        int yearOfService = input.nextInt();
        System.out.print("Enter your salary: ");
        int salary = input.nextInt();
        int bonus =0;
        if(yearOfService > 5){
            bonus = (salary *5)/100;
            System.out.println("Hey! You get a Bonus of " + bonus);
        }
        else{
            System.out.println("No Bonus");

        }

    }
}
