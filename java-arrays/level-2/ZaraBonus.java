import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0.0, totalOldSalary =0.0, totalNewSalary =0.0;
        for(int i=0; i< 10; i++)
        {
            System.out.print("Enter the salary for " + (i+1) + " employee: ");
            salary[i] = input.nextDouble();
            System.out.print("Enter the year of service for " + (i+1) + " employee: ");
            yearOfService[i] = input.nextDouble();
            while(salary[i] <=0 || yearOfService[i] <=0)
                {
                    System.out.println("Enter the salary for " + (i+1) + " employee again: ");
                    salary[i] = input.nextDouble();
                    System.out.print("Enter the year of service for " + (i+1) + " employee agin: ");
                    yearOfService[i] = input.nextDouble();
                }
        }

        for(int i=0; i<10;i++)
        {
            if(yearOfService[i] > 5)
            {
                bonus[i] = (5* salary[i]) / 100;
            }
            else
            {
                bonus[i] = (2 * salary[i]) / 100;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("The total bonus is: " + totalBonus);
        System.out.println("The total old salary is: " + totalOldSalary);
        System.out.println("The total new salary is: " + totalNewSalary);
    }
}
