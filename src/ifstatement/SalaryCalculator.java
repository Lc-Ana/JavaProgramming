package ifstatement;

import java.util.Scanner;

/*
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        //initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get unknown values
        System.out.print("How many sales did the employee make this week? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //quick detour for the bonus earners
        if (sales > quota) {
            salary = salary + bonus;
        }

        //output
        System.out.println("The employee's pay is $" + salary);
    }
}
