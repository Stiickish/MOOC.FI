
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int sum = 0;
        int value = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            numbers.add(input);

            value = value + 1;
            sum = sum + input;

            
            // implement here a program, that first reads user input
            // adding them on a list until user gives -1.
            // Then it computes the average of the numbers on the list
            // and prints it.

        }
        System.out.println("Average: " + (double) sum / value);
    }
}
