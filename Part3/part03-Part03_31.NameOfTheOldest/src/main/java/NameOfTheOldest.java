
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String oldest = null;
        int greatest = 0;
        String[] number = new String[0];

        while (!input.isEmpty()) {
            number = input.split(",");

            for (int i = 1; i < number.length; i++) {
                if (Integer.valueOf(number[i]) > greatest) {
                    greatest = Integer.valueOf(number[i]);
                    oldest = number[i - 1];
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + oldest);
    }

}
