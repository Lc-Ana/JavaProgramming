package javafundamentals;

import java.util.Scanner;

/*
Ask a user for a season of the year, whole number, an adjective.
Use the input to complete the sentence below then output rhe result:
"On a [adjective] [seasonOFTheYear] day, I drink a minimum of [whole number] cup of coffee."
*/
public class CompleteSentence {
    public static void main(String[] args) {
        //Ask a user for the inputs
        System.out.println("Introduce the season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String seasonOFTheYear = scanner.next();

        System.out.println("Introduce the number: ");
        int number = scanner.nextInt();

        System.out.println("Introduce an adjective: ");
        String adjective = scanner.next();
        scanner.close();
        //Use inputs to complete the given sentence
        System.out.println("On a " + adjective + " " + seasonOFTheYear + " day, I drink a minimum of "
                + number + " cup of coffee.");
    }
}