package loops;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
 *WHILE LOOP
 *Each store employee makes $15 an hour. Write a program that allows the employee
 *to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double workedHours = scanner.nextDouble();

        while (workedHours > maxHours){
            System.out.println("Invalid entry. Yours hours must be between 1 and 40 . Try again.");
            workedHours = scanner.nextDouble();
        }

        scanner.close();

        double grossPay = workedHours * rate;
        System.out.println("The gross is $: " + grossPay);
    }
}
