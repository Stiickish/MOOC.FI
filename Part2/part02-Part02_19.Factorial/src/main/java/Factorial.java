
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int userInput = Integer.valueOf(scanner.nextLine());

        int fact = 1;
        for (int i = 1; i <= userInput; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
    }
}
