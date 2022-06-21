package loops;

import java.util.Scanner;

/*
FOR LOOP
Write a cashier program that will scan a given number of items and totally the cost.
 */
public class Cashier {
    public static void main(String[] args) {
        //get the number of items
        System.out.println("Enter the number of items: ");
        Scanner scanner = new Scanner(System.in);
        int numberItems = scanner.nextInt();

        boolean again;
        double total = 0;

        //create a loop to iterate through all of the items and accumulate the costs
        for(int i = 0; i < numberItems; i ++){
            System.out.println("Enter the price for this item: ");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();

        System.out.println(total);
    }
}
