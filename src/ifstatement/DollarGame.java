package ifstatement;

import java.util.Scanner;

/*
The objective of the game: enter enough change to equal exactly 1$!
Create a program that asks a user to enter the quantities for the following coins:
pennies, nickels, dimes, and quarters.
Your program should count up the value of all the changes.
If it's less than 1$, they win!
If it's more than 1$, tell them by how much they went over.
If it's less than 1$, tell them by how much they went under.
Feel free to change the game for your country's currency!
 */
public class DollarGame {
    public static void main(String[] args) {
        //known data
        double penny = 0.1;
        double nickel = 0.5;
        double dime = 0.10;
        double quarter = 0.25;
        int expectedValue = 1;

        //enter user quantities
        System.out.println("Enter how many pennies would you like:");
        Scanner scanner = new Scanner(System.in);
        int numberOfPennies = scanner.nextInt();

        System.out.println("Enter how many nickels would you like:");
        int numberOfNickels = scanner.nextInt();

        System.out.println("Enter how many dimes would you like:");
        int numberOfDimes = scanner.nextInt();

        System.out.println("Enter how many quarters would you like:");
        int numberOfQuarters = scanner.nextInt();
        scanner.close();

        //decision
        double actualValue = penny * numberOfPennies + nickel * numberOfNickels +
                dime * numberOfDimes + quarter * numberOfQuarters;
        if (expectedValue == actualValue) {
            System.out.println("Congrats! It's exactly 1$ you have win the game!");
        } else if (expectedValue <= actualValue) {
            double wentOverValue = actualValue - expectedValue;
            System.out.println("Sorry! It's more 1$, you went over " +
                    wentOverValue + "$. Try again.");
        } else {
            double wentUnderValue = expectedValue - actualValue;
            System.out.println("Sorry! It's less 1$, you went under " +
                    wentUnderValue + "$. Try again.");
        }
    }
}
