package loops;

import java.util.Scanner;

/*
DO WHILE LOOP
Write a program that  allows a user  to enter two numbers,
and then sums up the two numbers. The user should be able to
repeat this action  until they indicate they are done.
 */
public class AddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean again;

        do{
            System.out.println("Enter first number: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            int sum = firstNumber + secondNumber;
            System.out.println("The sum is: " + sum);

            System.out.println("Would you like to continue?");
            again = scanner.nextBoolean();
        } while(again);

        scanner.close();
    }
}
