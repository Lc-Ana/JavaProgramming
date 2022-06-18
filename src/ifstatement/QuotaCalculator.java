package ifstatement;

import java.util.Scanner;

/*
IF ELSE
All salespeople are expected to make at least 10 sales  each week.
For those who do, they receive a congratulatory message.
For those who do not, they are informed  of how many sale they were short.
 */
public class QuotaCalculator {
    public static void main(String[] args) {
        //data we knw
        int quota = 10;

        //input data
        System.out.print("Enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //decision
        if (sales >= quota) {
            System.out.println("Congrats! You have met your quota.");
        } else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
        }
    }
}
