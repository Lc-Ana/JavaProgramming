package ifstatement;

import java.util.Scanner;

/*
logical operators
To qualify for a loan there are two conditions that must make at least $30,000 and
they must have also been at their job for 2 or more years.
 */
public class LogicalRelationalOperatorsLoanQualifier {
    public static void main(String[] args) {
        //known data
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //input data
        System.out.print("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of work: ");
        double years = scanner.nextDouble();
        scanner.close();

        //decision 
        if ((salary >= requiredSalary && years >= requiredYearsEmployed)) {
                System.out.println("Congrats! You qualify for the loan.");
        } else {
            System.out.println("Sorry, you must earn at least $" + requiredSalary +
                    " or you must have worked at your current job " + requiredYearsEmployed +
                     " years to qualify for the loan.");
        }
    }
}
