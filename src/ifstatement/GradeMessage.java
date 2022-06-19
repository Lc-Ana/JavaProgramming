package ifstatement;

import java.util.Locale;
import java.util.Scanner;
/*
have a user enter their grade,
and using a switch statement,
print out a message letting them know how they did.
 */
public class GradeMessage {
    public static void main(String[] args) {

        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade.toUpperCase(Locale.ROOT)) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit hard.";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Invalid grade!";
        }
        System.out.println(message);
    }
}
