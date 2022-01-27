
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else {
                sum = input + sum;
                totalNumbers++;
            }
        }
        System.out.println("Number of numbers: " + totalNumbers);
        System.out.println("Sum of the numbers: " + sum);
    }

}
